package Product;

public class pro_for {
	public static void main(String[] args) {
        int[] a = {1, 2, 8, 4};
        System.out.println("product = " + productofArray(a));
    }
	public static int productofArray(int[] a) {
	    int product = 1;

	    for (int x : a) {
	        product *= x;
	    }

	    return product;
	}

}
