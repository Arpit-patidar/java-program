package Even_Odd;

public class CountEven_For {

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 4};
        System.out.println("Even count = " + countEven(a));
    }

    public static int countEven(int[] a) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
