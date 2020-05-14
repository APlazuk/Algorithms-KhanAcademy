public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(" Kobyła ma mały bok"));
    }

    public static boolean isPalindrome(String word) {
        String stringToCheck = word.replaceAll(" ", "").toLowerCase().trim();

        //base cases

        if (stringToCheck.length() <= 1) {
            return true;
        }
        if (firstCharacter(stringToCheck) != lastCharacter(stringToCheck)) {
            return false;
        }
        // recursive case
        return isPalindrome(middleCharacters(stringToCheck));
    }

    public static char firstCharacter(String string) {
        return string.charAt(0);
    }

    public static char lastCharacter(String string) {
        return string.charAt(string.length() - 1);
    }

    public static String middleCharacters(String string) {
        return string.substring(1, string.length() - 1);
    }
}
