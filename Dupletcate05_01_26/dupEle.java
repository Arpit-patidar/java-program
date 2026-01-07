package Dupletcate05_01_26;

import java.util.Arrays;

public class dupEle {
public static void main(String[] args) {
	int[]a= {1,2,4,4,5,6,6,3,2,5,8,9,9,};
	System.out.println(Arrays.toString(printDup(a)));
}
public static int[] printDup(int[]a) {
	int[]res = new int[a.length];
	int index=0;
	for(int i=0;i<a.length;i++) {
		boolean isDuplicate =false;
		for (int j = i+1; j < res.length; j++) {
			if(a[i]==a[j]) {
				isDuplicate =true;
			break;
			}
		}
		if(isDuplicate==true) {
		res[index++]=a[i];
		}
	}
	int[] output = new int [index];
int	count =0;
	for (int i = 0; i < res.length; i++) {
		if(res[i]!=0) {
			output[i]=res[i];
			count++;
		}
	}System.err.println("count willl be"+count);
	return output;
}
}
