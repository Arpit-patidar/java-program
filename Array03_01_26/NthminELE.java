package Array03_01_26;

public class NthminELE {
public static void main(String[] args) {
	int []a= {1,2,3,4,5};
	System.out.println(nthminEle(a,3));
}
public static int nthminEle(int[]a,int n) {
	int min= Integer.MAX_VALUE;
	for(int k=1;k <=n;k++) {
		min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min)
				min = a[i];
		}
		//max ele will replace with Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]==min)
				a[i]=Integer.MAX_VALUE;
		}
	}
	return min;
}
}
