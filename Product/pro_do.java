package Product;

public class pro_do {
	public static void main(String[] args) {
        int[] a = {11, 2, 4, 4};
        System.out.println("product = " + productofArray(a));
	}
	public static int productofArray(int[] a) {
	    int product = 1;
	    int i = 0;

	    do {
	        product *= a[i];
	        i++;
	    } while (i < a.length);

	    return product;
	}

    

}
