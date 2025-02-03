package Strings;

public class vowels {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int vowelCount = 0, consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i)); // Convert to lowercase for uniformity
            
            if (ch >= 'a' && ch <= 'z') { // Check if it's an alphabet character
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}
