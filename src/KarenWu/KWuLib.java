package KarenWu;

public class KWuLib {

    public static int sumUpTo(int input) {
        int output = input + 1;
        output = input * output;
        return output / 2;
    }

    public static int leastCommonMultiple(int num1, int num2, int num3) {
        int lcm;
        if (num1 > num2) {
            lcm = num1;
        } else {
            lcm = num2;
        }
        for (; lcm <= (num1 * num2); lcm++) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                break;
            }
        }
        int lcm3;
        if (num3 > lcm) {
            lcm3 = num3;
        } else {
            lcm3 = lcm;
        }
        for (; lcm3 <= (num3 * lcm); lcm3++) {
            if (lcm3 % num3 == 0 && lcm3 % lcm == 0) {
                break;
            }
        }
        return lcm3;
    }

    public static boolean isFibonnaci(int num) {
        int one = 5 * num * num + 4;
        int two = 5 * num * num - 4;
        int output = (int)Math.sqrt(one);
        int output2 = (int)Math.sqrt(two);
        boolean fib = (output * output == one) || (output2 * output2 == two);
        return fib;
    }

    public static String dateStr (String str) {
        String month = str.substring(0,2);
        String day = str.substring(3,5);
        String year = str.substring(7,11);
        String output = day + "-" + month + "-" + year;
        return output;
    }

    //public static boolean isPalindrome(String word) {
        //int length = word.length();
        //for (int i = 0; i == word.length(); i++) {
            //if (word.charAt(i) == word.charAt(length)) {
                //length = word.length() - 1;
            //}
            //else {
                //return false;
            //}
        //}
    //}

    public static int stringUnion(String word1, String word2, String word3) {
        int counter = 0;
        for (int i = 0; i < word1.length(); i++) {
            if word1.charAt(i) == word2.charAt(1)
        }
    }
}
