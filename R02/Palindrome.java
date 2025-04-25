//Sofia Koshy
//AT Java
//04/23/2025
//to lower case + method replace all spaces
//and punctuation with ""
//if phrase.length ==1 return
//isPalin("y") (should print true)
//isPalin("") (true)

public class Palindrome {

    public static boolean isPalindromeRecursive(String phrase) {
        // clean up input
        phrase = phrase.toLowerCase().replaceAll("[^a-z]", "");

        return checkPalindromeRecursive(phrase);
    }

    private static boolean checkPalindromeRecursive(String s) {
        if (s.length() <= 1) {
            return true; // base case
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return checkPalindromeRecursive(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeRecursive("Madam, I’m Adam")); // true
        System.out.println(isPalindromeRecursive("Kayak")); // true
        System.out.println(isPalindromeRecursive("Hello")); // false
        System.out.println(isPalindromeRecursive("y")); // true
        System.out.println(isPalindromeRecursive("")); // true
    }
}
