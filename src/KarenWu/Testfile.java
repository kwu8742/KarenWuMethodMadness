package KarenWu;

public class Testfile {

    public static void main(String[] args) {
        System.out.println(KWuLib.sumUpTo(10));                 //Print out the sum of all the numbers before and including input
        System.out.println(KWuLib.leastCommonMultiple(2, 3, 4));      //Print out the least common multiple between num1, num2, and num3
	    System.out.println(KWuLib.isFibonnaci(14));              //Print out whether num is a fibonacci number
	    System.out.println(KWuLib.dateStr("01/08/1999"));             //Print out the date format from mm/dd/yyyy to dd-mm-yyyy
        System.out.println(KWuLib.isPalindrome("batman"));      //Print out whether the word is a palindrome
    }
}
