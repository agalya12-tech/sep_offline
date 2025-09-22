package dsa.numberPrograms;

public class Alphabets {
    public static void main(String[] args) {
        char start = 'A';
        char end = 'Z';
        do {
            System.out.print(start);
            start++;
        } while (start <= end);
    }
}
