package jsp.Array;

public class Try_catch {

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3};
        System.out.println("length = " + Arrayoflength(a));
    }

    public static int Arrayoflength(int[] a) {
        int count = 0;

        try {
            while (true) {
                int temp = a[count]; 
                count++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
          
        }

        return count;
    }
}
