package Even_Odd;

public class Odd_for {

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 4};
        OddOfArray(a);
    }

    public static void OddOfArray(int[] a) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i] + " is Odd");
            }
        }
    }
}
