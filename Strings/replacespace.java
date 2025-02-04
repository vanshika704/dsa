package Strings;

public class replacespace {
    public static void main(String[] args) {
        String str = "Hello Vanshika ";
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch == ' ') { // Correct condition for space
                result.append("\uD83D\uDE0A");
            } else {
                result.append(ch);
            }
        }

        System.out.println("Modified String: " + result);
    }
}
