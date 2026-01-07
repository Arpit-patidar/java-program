package jsp.Array;

public class foreach_CAl {
	public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        System.out.println("sum = " + sumofArray(a));
    }
	public static int sumofArray(int[] a) {
	    int sum = 0;

	    for (int x : a) {
	        sum += x;
	    }

	    return sum;
	}

}
