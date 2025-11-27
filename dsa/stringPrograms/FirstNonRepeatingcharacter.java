public class FirstNonRepeatingcharacter {
     public static void main(String[] args) {
        String s = "swiss";
        for (char c : s.toCharArray()) {
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                System.out.println(c+" is the first non repeating character");
            break;
            }
        }

    }
}
