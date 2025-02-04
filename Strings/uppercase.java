package Strings;

public class uppercase {
    public static void main(String[] args) {
        String str = "HellO VaNsHu";
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else { // No condition needed for else
                result.append(Character.toUpperCase(ch));
            }
        }

        System.out.println("Converted String: " + result);
    }
}
