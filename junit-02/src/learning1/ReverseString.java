package learning1;

public class ReverseString {
    public static String reverseString(String original) {
        // Create an empty string to store the reversed characters
        String reversed = "";
        // Start from the end of the original string
        int i = original.length() - 1;
        // Iterate until the beginning of the string
        while (i >= 0) {
            // Append the character at index i to the reversed string
            reversed += original.charAt(i);
            // Move to the previous character in the original string
            i--;
        }
        // Return the reversed string
        return reversed;
    }
}
