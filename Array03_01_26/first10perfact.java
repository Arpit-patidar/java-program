package Array03_01_26;

import java.util.Arrays;

public class first10perfact {
public static void main(String[] args) {
//	System.out.println(Arrays.toString(first10perfact()));
//isperfact(6);
}
//public static int[] first10perfact() {
//	int []res = new int[10];
//	int num=1;
//	int count=0;
//	while(count<10) {
//		if(isperfact(num)) {
//			res[count++]=num;
//		}
//		num++;
//	}
//	return res;
//}
public static boolean isperfact(int n) {
	int sum=0;
	for(int i=1;i<=n/2;i++) {
		if(n%i==0)
			sum+=i;
	}
	return sum==n;
}
}
