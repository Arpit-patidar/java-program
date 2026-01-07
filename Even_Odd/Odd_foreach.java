package Even_Odd;

public class Odd_foreach {

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 4};
        OddOfArray(a);
    }

    public static void OddOfArray(int[] a) {

        for (int x : a) {
            if (x % 2 != 0) {
                System.out.println(x + " is Odd");
            }
        }
    }
}
