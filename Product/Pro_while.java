package Product;

public class Pro_while {
	public static void main(String[] args) {
        int[] a = {1, 2, 4, 4};
        System.out.println("product = " + productofArray(a));
    }
	public static int productofArray(int[] a) {
	    int product = 1;
	    int i = 0;

	    while (i < a.length) {
	        product *= a[i];
	        i++;
	    }

	    return product;
	}


}
