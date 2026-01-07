package happy_num;

public class harshadArray {
	public static void main(String[] args) {
		int[] a = {153,24,154,10,11};
		for(int i=0;i<a.length;i++) {
			if(isHarshad(a[i]))
				System.out.print(a[i]+",");
		}
	}
	public static boolean isHarshad(int n) {
		int sum = 0;
		int temp = n;
		while(n!=0) {
			int r=n%10;
			sum = sum +r;
			n=n/10;
		}
		return temp%sum==0;
	}

}
