public class RemoveCharacter {
    public static void main(String[] args) {
        String str = "Hello World 123!";
        System.out.println("Original String: " + str);
        System.out.println("After removing vowels: " + removeVowels(str));
        System.out.println("After removing consonants: " + removeConsonants(str));
        System.out.println("After removing digits: " + removeDigits(str));
    }
    public static String removeVowels(String s) {
        StringBuilder b = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                continue;
            }
            b.append(c);
        }
        return b.toString();
    }

    public static String removeConsonants(String s) {
        StringBuilder b = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ("BCDFGHJKLMNPQRSTUVWXYZbcdfghjklmnpqrstvwxyz".indexOf(c) != -1) {
                continue;
            }
            b.append(c);
        }
        return b.toString();
    }

    public static String removeDigits(String s) {
        StringBuilder b = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                continue;
            }
            b.append(c);
        }
        return b.toString();
    }
}
