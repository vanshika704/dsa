package Strings;

class RabinKarp {
    // Prime number for hash calculation
    private static final int PRIME = 101;

    // Function to calculate hash value
    private static long createHash(String str, int length) {
        long hash = 0;
        for (int i = 0; i < length; i++) {
            hash += str.charAt(i) * Math.pow(PRIME, i);
        }
        return hash;
    }

    // Function to recalculate hash (rolling hash)
    private static long recalculateHash(String str, int oldIndex, int newIndex, long oldHash, int patternLen) {
        long newHash = oldHash - str.charAt(oldIndex);
        newHash /= PRIME;
        newHash += str.charAt(newIndex) * Math.pow(PRIME, patternLen - 1);
        return newHash;
    }

    // Rabin-Karp pattern search function
    public static void rabinKarpSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        long patternHash = createHash(pattern, m);
        long textHash = createHash(text, m);

        for (int i = 0; i <= n - m; i++) {
            // If hash values match, verify by checking characters
            if (patternHash == textHash && text.substring(i, i + m).equals(pattern)) {
                System.out.println("Pattern found at index " + i);
            }
            // Compute next hash (rolling hash)
            if (i < n - m) {
                textHash = recalculateHash(text, i, i + m, textHash, m);
            }
        }
    }

    // Main method to test the algorithm
    public static void main(String[] args) {
        String text = "ABABDABACDABABCABAB";
        String pattern = "ABABCABAB";
        rabinKarpSearch(text, pattern);
    }
}
