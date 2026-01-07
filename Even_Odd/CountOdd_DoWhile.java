package Even_Odd;

public class CountOdd_DoWhile {

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 4};
        System.out.println("Odd count = " + countOdd(a));
    }

    public static int countOdd(int[] a) {
        int count = 0;
        int i = 0;

        do {
            if (a[i] % 2 != 0) {
                count++;
            }
            i++;
        } while (i < a.length);

        return count;
    }
}
