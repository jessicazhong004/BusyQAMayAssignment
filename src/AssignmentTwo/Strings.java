package AssignmentTwo;

public class Strings {
    public static void main(String[] args) {
        String userID1 = "JESSICA";
        String userID2 = "jessica";
        System.out.println(userID1.equalsIgnoreCase(userID2));

        System.out.println("===========");
        System.out.println("concatenate: " + userID1 + userID2);
        // System.out.println(userID1.concat(userID2));

        System.out.println("===========");
        System.out.println("length of the 1st string " + userID1.length());

        System.out.println("===========");
        String str1 = "My cat is meowing.";
        System.out.println("substring is " + str1.substring(3, 6));

        System.out.println("===========");
        System.out.println("Capitalized str1 is " + str1.toUpperCase());
        System.out.println("now they are all lowercase: " + str1.toUpperCase().toLowerCase());

        System.out.println("===========");
        System.out.println("reversed string is " + reverseString("Friday is coming"));

        System.out.println("===========");
        String repeatCharString = "Aritzia is a cloth store.   ";
        System.out.println("number of time a character repeated in the string: " + countChar(repeatCharString, 'a'));

        System.out.println("===========");
        System.out.println("Number of words in this sentence: " + numberOfRepeat(repeatCharString));

        System.out.println("===========");
        System.out.println("convert int to String is: " + convertIntToStr(999));

        System.out.println("===========");
        System.out.println("convert String to int is: " + convertStringToInt("8392"));

        System.out.println("===========");
        System.out.println("all white spaces are removed: " + rmvWhiteSpaceInString("I am not a cat."));

        System.out.println("===========");
        System.out.println(isPalindrome("not level"));
        System.out.println(isPalindrome("level"));


    }

    public static String reverseString(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            str += str.charAt(i);
        }
        return str;
    }

    public static int numberOfRepeat(String str) {
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        return count;
    }

    public static int countChar(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    public static String convertIntToStr(int i) {
        return Integer.toString(i);
    }

    public static int convertStringToInt(String str) {
        return Integer.parseInt(str);
    }

    public static String rmvWhiteSpaceInString(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static boolean isPalindrome(String str) {
        int strSize = str.length();
        for (int i = 0; i < (strSize / 2); i++) {
            if (str.charAt(i) != str.charAt(strSize - i - 1)) {
                return false;
            }
        }
        return true;
    }


}
