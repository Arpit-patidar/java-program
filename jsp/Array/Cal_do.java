package jsp.Array;

public class Cal_do {
	 public static void main(String[] args) {
	        int[] a = {1, 2, 8, 4};
	        System.out.println("sum = " + sumofArray(a));
	    }

	 public static int sumofArray(int[] a) {
		    int sum = 0;
		    int i = 0;

		    do {
		        sum += a[i];
		        i++;
		    } while (i < a.length);

		    return sum;
		}

}
