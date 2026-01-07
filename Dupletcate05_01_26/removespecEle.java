package Dupletcate05_01_26;

import java.util.Arrays;

//specific Element
public class removespecEle {
public static void main(String[] args) {
	int[]a= {1,2,3,3,2};
	System.out.println(Arrays.toString(removespc(a, 2)));
}
public static int[] removespc(int[]a,int ele) {
	int count=0;
	for (int i = 0; i < a.length; i++) {
		if(a[i]==ele)
			count++;
	}
	int[] res = new int[a.length-count];
	int index =0;
	for (int i = 0; i < a.length; i++) {
		if(a[i]!=ele)
res[index++]=a[i];
	}
	return res;
}
}
