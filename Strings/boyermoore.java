package Strings;

import java.util.Arrays;

public class boyermoore {
    private static final int ALPHABET_SIZE = 256; // size define kiya

    // Preprocesses the pattern and builds the bad character table
    private static int[] buildBadCharTable(String pattern) {
        int[] badChar = new int[ALPHABET_SIZE];
        Arrays.fill(badChar, -1);

        for (int i = 0; i < pattern.length(); i++) {
            badChar[pattern.charAt(i)] = i;
        }
        return badChar;
    }

    // Boyer-Moore pattern search function
    public static void boyerMooreSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int[] badChar = buildBadCharTable(pattern);
        int shift = 0;

        while (shift <= (n - m)) {
            int j = m - 1;

            // Compare pattern with text from the rightmost character
            while (j >= 0 && pattern.charAt(j) == text.charAt(shift + j)) {
                j--;
            }

            // If pattern is found
            if (j < 0) {
                System.out.println("Pattern found at index " + shift);
                shift += (shift + m < n) ? m - badChar[text.charAt(shift + m)] : 1;
            } else {
                // Shift pattern based on bad character rule
                shift += Math.max(1, j - badChar[text.charAt(shift + j)]);
            }
        }
    }

 //   // Main method to test the algorithm
    public static void main(String[] args) {
        String text = "ABABDABACDABABCABAB";
        String pattern = "ABABCABAB";
        boyerMooreSearch(text, pattern);
    }
}
