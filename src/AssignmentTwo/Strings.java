package AssignmentTwo;

public class Strings {
    public static void main(String[] args) {
//        String userID1 = "JESSICA";
//        String userID2 = "jessica";
//        System.out.println(userID1.equalsIgnoreCase(userID2));
//
//        System.out.println("===========");
//        System.out.println("concatenate: " + userID1 + userID2);
//        // System.out.println(userID1.concat(userID2));
//
//        System.out.println("===========");
//        System.out.println("length of the 1st string " + userID1.length());
//
//        System.out.println("===========");
//        String str1 = "My cat is meowing.";
//        String getSubString = str1.substring(3, 6);
//        System.out.println("substring is " + getSubString);
//
//        System.out.println("===========");
//        System.out.println("Capitalized str1 is " + str1.toUpperCase());
//        System.out.println("now they are all lowercase" + str1.toUpperCase().toLowerCase());
//
//        System.out.println("===========");
//        String originalStr = "My fridge doesn't work.";
//        String reversedStr = "";
//
//        for (int i = originalStr.length() - 1; i >= 0; i--) {
//            reversedStr += originalStr.charAt(i);
//        }
//
//        System.out.println("reversed string is " + reversedStr);

        System.out.println("===========");
        String repeatCharString = "Aritzia is a cloth store.   ";
        System.out.println("number of time a character repeated in the string: " + countChar(repeatCharString, 'a'));

        System.out.println("===========");
        int count = 1;
        for (int i = 0; i < repeatCharString.length() - 1; i++) {
            if ((repeatCharString.charAt(i) == ' ') && (repeatCharString.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        System.out.println("Number of words in this sentence: " + count);

        System.out.println("===========");
        System.out.println("convert int to String is: " + convertIntToStr(999));

        System.out.println("===========");
        System.out.println("convert String to int is: " + convertStringToInt("8392"));

        System.out.println("===========");
        System.out.println("all white spaces are removed: "+rmvWhiteSpaceInString("I am not a cat."));

        System.out.println("===========");
        System.out.println(isPalindrome("not level"));
        System.out.println(isPalindrome("level"));



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
