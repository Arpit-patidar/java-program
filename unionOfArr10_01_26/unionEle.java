package unionOfArr10_01_26;

import java.util.Arrays;

public class unionEle {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5 };
		int[] b = { 3, 4, 5, 6 };
		System.out.println(Arrays.toString(unionEle(a, b)));
	}

	public static int[] unionEle(int[] a, int[] b) {
		int[] res = new int[a.length + b.length];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			
			res[index++] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			
			boolean ispresent = false;
			
			for (int j = 0; j < a.length; j++) {
				
				if (b[i] == a[j]) {
					
					ispresent = true;
					break;
				}
			}
			if (!ispresent) {
				res[index++] = b[i];
			}
//			return res;
		}

		int[] output = new int[index];
int	count =0;
		for (int i = 0; i < index; i++) {
			if (res[i] != 0) {
				output[i] = res[i];
			count++;
			System.out.println("count will be: "+count);
			}
	}
		

		
		return output;
	}
}