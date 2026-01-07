package Even_Odd;

public class Even_for {

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 4};
        EvenOfArray(a);   // method call
    }

    public static void EvenOfArray(int[] a) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i] + " is Even");
            }
        }
    }
}
