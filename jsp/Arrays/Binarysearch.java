package Arrays;

import java.util.Arrays;

public class Binarysearch {
public static void main(String[] args) {
	int[]a= {1,2,3,4,5};
	int index= Arrays.binarySearch(a, 4);
	System.out.println("index=:"+index);
	int index2 = Arrays.binarySearch(a, 0);
	System.out.println("index ;"+index2);
}
}
