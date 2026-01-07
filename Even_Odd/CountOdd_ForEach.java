package Even_Odd;

public class CountOdd_ForEach {

    public static void main(String[] args) {
        int[] a = {1, 2, 3,4,6,6,7, 4};
        System.out.println("Odd count = " + countOdd(a));
    }

    public static int countOdd(int[] a) {
        int count = 0;

        for (int x : a) {
            if (x % 2 != 0) {
                count++;
            }
        }

        return count;
    }
}
