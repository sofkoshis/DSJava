public class MethodB {
    public static int isVowel(char x) {
        if (x == 'a'|| x == 'e' || x == 'i' || x == 'o'|| x == 'u') {
            return 1;
        } else {
            return 0;
        }
        }
public static int countVowels(String phrase) {
    int count = 0;
    for (int i = 0; i < phrase.length(); i ++) {
        count += isVowel(phrase.charAt(i));
    }
    return count;

    }

    
    public static void main(String[] args) {
        String firstPhrase = "Hello WOrld";
        firstPhrase = firstPhrase.toLowerCase();
        int vowelCount = countVowels(firstPhrase);
        System.out.println("The number of vowels in " + firstPhrase + " is " + vowelCount);
    }
}

