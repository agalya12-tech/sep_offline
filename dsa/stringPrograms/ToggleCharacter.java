public class ToggleCharacter {
    public static void main(String[] args) {
        String s = "JaVa";
        StringBuilder b = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                int ch = c + 32;
                b.append((char) ch);
            }else if(Character.isLowerCase(c)){
                b.append(Character.toUpperCase(c));
            }
            
            // } else if (c >= 'a' && c <= 'z') {
            //     int ch = c - 32;
            //     b.append((char) ch);
            // }
        }
        System.out.println(b);
    }
}
