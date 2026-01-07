package Product;

public class pro_for_loop {
	public static void main(String[] args) {
        int[] a = {1, 2, 4, 4};
        System.out.println("product = " + productofArray(a));
    }
	public static int productofArray(int[] a) {
        int product = 1;

        for (int i = 0; i < a.length; i++) {
            product *= a[i];
        }

        return product;
    }

}
