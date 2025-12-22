package test_project;

import java.util.Arrays;

public class TestMain {

	public static void main(String[] args) {
		String [] arr={"INFO [GET][/api/users][200][120ms]",
				       "INFO [GET][/api/orders][404][60ms]",
                       "INFO [GET][/api/users][500][95ms]",
				       "INFO [GET][/api/orders][200][180ms]",
				       "INFO [POST][/api/orders][200][310ms]",
				       "DEBUG [OPTIONS][/api/orders][204][-]",
				       "INFO [POST][/api/users][201][250ms]",
				       };
          
        sampleOutPut1(arr);  
        sampleOutPut2(arr);
        sampleOutPut3(arr);
        sampleOutPut4(arr);
	}


    public static void sampleOutPut2(String[] arr) {

    System.out.println("Average Response Time per Endpoint:");

    Arrays.stream(arr)
        .filter(line -> !line.contains("[-]")) 
        .collect(java.util.stream.Collectors.groupingBy(
            line -> line.split("\\]")[1].substring(1), 
            java.util.stream.Collectors.averagingInt(
                line -> {
                    String time = line.split("\\]")[3].substring(1).replace("ms", "");
                    return Integer.parseInt(time);
                }
            )
        ))
        .forEach((endpoint, avgTime) ->
            System.out.println(endpoint + ":" + Math.round(avgTime) + "ms")
        );
}

 public static void sampleOutPut3(String[] arr) {

    String slowest = Arrays.stream(arr)
        .filter(line -> !line.contains("[-]"))
        .max((l1, l2) -> {
            int t1 = Integer.parseInt(l1.split("\\]")[3].substring(1).replace("ms", ""));
            int t2 = Integer.parseInt(l2.split("\\]")[3].substring(1).replace("ms", ""));
            return Integer.compare(t1, t2);
        })
        .orElse(null);

    if (slowest != null) {
        String endpoint = slowest.split("\\]")[1].substring(1);
        String time = slowest.split("\\]")[3].substring(1);
        System.out.println("Slowest Call Endpoint");
        System.out.println(endpoint + "(" + time + ")");
    }
}

 
 
 
 
 
 
 
 
 public static void sampleOutPut4(String []arr){

    System.out.println("Error Rate:");
    long totalRequests = arr.length;
    long errorCount = Arrays.stream(arr)
        .map(line -> line.split("\\]")[2].substring(1)) 
        .filter(statusCode -> {
            try {
                return Integer.parseInt(statusCode) >= 400;
            } catch (NumberFormatException e) {
                return false; 
            }
        })
        .count();
    double errorRate = (double) errorCount / totalRequests * 100;
    System.out.printf("%.2f%%\n", errorRate);          
 }

   

public static void sampleOutPut1(String[]arr){
        System.out.println("Requests per endpoint");
        Arrays
            .stream(arr)
            .map(line -> line.split("\\]")[1].substring(1)) 
            .collect(java.util.stream.Collectors.groupingBy(
                endpoint -> endpoint,
                java.util.stream.Collectors.counting()
            ))
            .entrySet()
            .stream()
            .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
            .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
    }
    

}
