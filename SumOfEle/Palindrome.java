package SumOfEle;

public class Palindrome {

    public static void main(String[] args) {

        int[] a = {131, 121, 141};

        System.out.println("Palindrome elements:");
        printPalindrome(a);
        printPalindrome_do(a);
        printPalindrome_while(a);
        
//        System.out.println(""+countPalindrome(a));
    }

    public static boolean isPalindrome(int num) {
        int temp = num, rev = 0;

        while (num > 0) {
            int last = num % 10;
            rev = rev * 10 + last;
            num /= 10;
        }
        return temp == rev;
    }
//for_loop
    public static void printPalindrome(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (isPalindrome(a[i])) {
                System.out.println(a[i]);
            }
        }
    }
    //while loop
    public static void printPalindrome_while(int[] a) {
    	int i =0;
       while(i < a.length) {
            if (isPalindrome(a[i])) {
                System.out.println(a[i]);
            }
        i++;
        }
    }
    //do loop
    public static void printPalindrome_do(int[] a) {

    	int i =0;
        do {
             if (isPalindrome(a[i])) {
                 System.out.println(a[i]);
             }
         i++;
         }while(i < a.length);
    }

}
