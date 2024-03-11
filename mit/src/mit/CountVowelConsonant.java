package mit;
import java.util.Scanner;
public class CountVowelConsonant {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[] counts = countVowelConsonant(input.toLowerCase());

        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);

        scanner.close();
	}

    public static int[] countVowelConsonant(String str) {
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
    }

