package revars02_01_26;

import java.util.Arrays;

public class perfact_num {
public static void main(String[] args) {
	int []a= {1,2,6,4,54,5,556,77,28,7,8};
	System.out.println(Arrays.toString(isperfact(a)));
	
}
public static int[] isperfact(int[]a) {
	int count=0;
	for(int i=0;i<a.length;i++) {
		if(isperfact(a[i]))
			count++;
	}
	int[] perfact = new int[count];
	int index=0;
	for(int i=0;i<a.length;i++) {
		if(isperfact(a[i]))
			perfact[index++]=a[i];
	}
	return perfact;
}
public static boolean isperfact(int n) {
	int sum=0;
	for(int i=1;i<=n/2;i++) {
		if(n%i==0)
			sum+=i;
	}
	return sum==n;
}
}
