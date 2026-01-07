package Arrays;

import java.util.Arrays;

public class Equal {
public static void main(String[] args) {
	int[]a= {1,2,4,6};
	int []b= {2,1,4,6};
//	Arrays.sort(a);
//	Arrays.sort(b);

	if(Arrays.equals(a,b))
	System.out.println("Array equals");
	else 
		System.out.println("Array not equals");
	

}
}