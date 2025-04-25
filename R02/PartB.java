public class PartB {

    public static boolean isPalindromeIterative(String phrase) {
        // clean up input
        phrase = phrase.toLowerCase().replaceAll("[^a-z]", "");

        int left = 0;
        int right = phrase.length() - 1;

        while (left < right) {
            if (phrase.charAt(left) != phrase.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeIterative("Madam, I’m Adam")); // true
        System.out.println(isPalindromeIterative("Kayak")); // true
        System.out.println(isPalindromeIterative("Hello")); // false
        System.out.println(isPalindromeIterative("y")); // true
        System.out.println(isPalindromeIterative("")); // true
    }
}
