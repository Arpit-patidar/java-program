package revars02_01_26;

import java.util.Arrays;

public class OnlyStrong {

    public static void main(String[] args) {
        int[] a = {144, 145, 1, 2, 40585, 409, 8};
        System.out.println(Arrays.toString(isStrongArray(a)));
    }

    public static int[] isStrongArray(int[] a) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (isStrong(a[i])) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if (isStrong(a[i])) {
                result[index++] = a[i];
            }
        }
        return result;
    }

    public static boolean isStrong(int n) {
        int temp = n;
        int sum = 0;

        while (n != 0) {
            int r = n % 10;
            sum += fact(r);
            n = n / 10;
        }
        return temp == sum;
    }

    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
