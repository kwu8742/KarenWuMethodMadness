package KarenWu;

public class KWuLib {

    public static int sumUpTo(int input) {
        int output = input + 1;            //Using the formula s = (n(n+1))/2 you find the sum of the numbers from 1 to n which is the input
        output = input * output;
        return output / 2;
    }

    public static int leastCommonMultiple(int num1, int num2, int num3) {
        int lcm;
        if (num1 > num2) {                  //if num1 is greater than num2 then set the least common multiple to num1, vice versa
            lcm = num1;
        } else {
            lcm = num2;
        }
        for (; lcm <= (num1 * num2); lcm++) {               //increase the lcm each time and divide num1 and num2 by it
            if (lcm % num1 == 0 && lcm % num2 == 0) {       //if the remainder is zero for both then the loop ends because that is the least common multiple
                break;
            }
        }
        int lcm3;
        if (num3 > lcm) {                   //find the least common multiple between num3 and and the least common multiple of num1 and num2 using the same method
            lcm3 = num3;
        } else {
            lcm3 = lcm;
        }
        for (; lcm3 <= (num3 * lcm); lcm3++) {
            if (lcm3 % num3 == 0 && lcm3 % lcm == 0) {
                break;
            }
        }
        return lcm3;                    //return the lcm of the three numbers
    }

    public static boolean isFibonnaci(int num) {
        int one = 5 * num * num + 4;
        int two = 5 * num * num - 4;
        int output = (int)Math.sqrt(one);
        int output2 = (int)Math.sqrt(two);
        boolean fib = (output * output == one) || (output2 * output2 == two);       //Using the rule that either 5n^2+4 or 5n^2-4 is a perfect square then n is a fibonacci number, n being the num
        return fib;
    }

    public static String dateStr (String str) {
        String month = str.substring(0,2);                      //separate the date into month, day, and year and excluding the slashes
        String day = str.substring(3,5);
        String year = str.substring(6,10);
        String date = day + "-" + month + "-" + year;         //put the strings back together with the dashes and day and month switched
        return date;
    }

    public static boolean isPalindrome (String word)
    {
        int index = 0;
        int end = word.length() - 1;                             //set the end index to the length of the word minus one
        for (; index < end; index++)                            //loop keeps going until the index is higher than the end index and index will increase by one each time
        {
            if (word.charAt(index) != word.charAt(end))         //compare the character at the last index to the character at the first index
            {
                return false;                                   //if they aren't equal then return false
            }
            end--;                                              //else subtract one from the end index to keep comparing to the middle
        }
        return true;                                            //return true when all the characters at end index and first index are the same from end points to middle
    }
}
