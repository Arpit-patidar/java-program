package jsp.Array;

public class Length_no {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3};
        System.out.println("length = " + Arrayoflength(a));
    }

    public static int Arrayoflength(int[] a) {
        int count = 0;
        for (int arr : a) {
            count++;
        }
        return count;
    }
}
 