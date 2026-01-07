package happy_num;

public class strongArray {
	public static void main(String[] args) {
		int[] a = {144,145,1,2,40585,409};
		for(int i=0;i<a.length;i++) {
			if(isStrong(a[i]))
				System.out.print(a[i]+ " ");
		}
	}
	public static boolean isStrong(int n) {
		int sum = 0;
		while(n!=0) {
			int r=n/10;
			sum = sum +fact(r);
			n=n/10;
		}
		return n == sum;
	}
	public static int fact(int n) {
		int fact =1;
		for(int i=0;i<=n;i++) {
			fact = fact*i;
		}
		return fact;
	}
}
