package Even_Odd;

public class Even_foreach {

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 4};
        EvenOfArray(a);
    }

    public static void EvenOfArray(int[] a) {

        for (int x : a) {
            if (x % 2 == 0) {
                System.out.println(x + " is Even");
            }
        }
    }
}
