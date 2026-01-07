package jsp.Array;

public class binaryArray {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5};

        for (int i = 0; i < a.length; i++) {
            System.out.println("Binary of " + a[i] + " : " + decimalToBinary(a[i]));
        }
    }

    public static String decimalToBinary(int n) {
        if (n == 0) return "0";

        String binary = "";
        while (n > 0) {
            int r = n % 2;
            binary = r + binary;
            n = n / 2;   
        }
        return binary;
    }
}
