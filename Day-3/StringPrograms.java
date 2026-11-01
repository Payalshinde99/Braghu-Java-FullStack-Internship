
import java.util.Arrays;

public class StringPrograms {

    public static void main(String[] args) {

        String text = "Java Programming";

        // 1. Reverse a string
        String reversed = new StringBuilder(text)
                .reverse().toString();
        System.out.println("Reversed: " + reversed);

        // 2. Check palindrome
        String word = "madam";
        String reverseWord = new StringBuilder(word)
                .reverse().toString();

        System.out.println("Palindrome: "
                + word.equalsIgnoreCase(reverseWord));

        // 3. Count vowels and consonants
        String sentence = "Hello Java";
        int vowels = 0;
        int consonants = 0;

        for (char ch : sentence.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) >= 0) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        // 4. Count characters (excluding spaces)
        String input = "Java is easy";
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println("Characters without spaces: " + count);

        // 5. Check whether two strings are anagrams
        String first = "listen";
        String second = "silent";

        char[] firstChars = first.toLowerCase().toCharArray();
        char[] secondChars = second.toLowerCase().toCharArray();

        Arrays.sort(firstChars);
        Arrays.sort(secondChars);

        System.out.println("Anagrams: "
                + Arrays.equals(firstChars, secondChars));

        // 6. Count occurrences of a character
        String name = "programming";
        char target = 'g';
        int occurrences = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == target) {
                occurrences++;
            }
        }

        System.out.println("Occurrences of " + target
                + ": " + occurrences);
    }
}
