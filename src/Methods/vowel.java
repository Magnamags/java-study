package Methods;

public class vowel {
        public static boolean isVowel(char c) {
            // Convert character to lowercase for case-insensitive comparison
            char lowerChar = Character.toLowerCase(c);

            // Check if the character is a vowel
            switch (lowerChar) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    return true; // It is a vowel
                default:
                    return false; // It is not a vowel
            }
        }
        public static void main(String[] args) {
            // Test cases
            char character = 'A';
            char testChar2 = 'b';

            System.out.println(character + " is a vowel: " + isVowel(character)); // true
            System.out.println(testChar2 + " is a vowel: " + isVowel(testChar2)); // false

        }
}
