package Array03_01_26;

public class NthmaxELE {
public static void main(String[] args) {
	int []a= {1,2,3,4,5};
	System.out.println(nthmaxEle(a,2));
}
public static int nthmaxEle(int[]a,int n) {
	int max= Integer.MIN_VALUE;
	for(int k=1;k <=n;k++) {
		max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				max = a[i];
		}
		//max element will replace with Integer.MAX_VALUE;

		for(int i=0;i<a.length;i++) {
			if(a[i]==max)
				a[i]=Integer.MIN_VALUE;
		}
	}
	return max;
}
}
