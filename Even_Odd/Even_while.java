package Even_Odd;

public class Even_while {

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 4};
        EvenOfArray(a);
    }

    public static void EvenOfArray(int[] a) {
        int i = 0;
        while (i < a.length) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i] + " is Even");
            }
            i++;
        }
    }
}
