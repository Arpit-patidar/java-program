package unionOfArr10_01_26;

import java.util.Arrays;

public class rightele {
	public static void main(String[] args) {
int[]a = {10,20,30,40,50};
System.out.println(Arrays.toString(Right(a)));
	}
	public static int[]Right(int[]a){
		int res [] = new int[a.length];
		int temp = a[a.length-1];
		res[0]= temp;
		int index =1;
		for (int i = 0; i < a.length-1; i++) {
			res[index++]=a[i];
		}
//		res[index]= temp;
		return res;
	}
} 
