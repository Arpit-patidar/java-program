package Even_Odd;

public class CountEven_ForEach {

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 4};
        System.out.println("Even count = " + countEven(a));
    }

    public static int countEven(int[] a) {
        int count = 0;

        for (int x : a) {
            if (x % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
