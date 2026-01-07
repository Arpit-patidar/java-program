package Even_Odd;

public class Odd_dowhile {

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 4};
        OddOfArray(a);
    }

    public static void OddOfArray(int[] a) {
        int i = 0;
        do {
            if (a[i] % 2 != 0) {
                System.out.println(a[i] + " is Odd");
            }
            i++;
        } while (i < a.length);
    }
}
