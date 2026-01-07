package happy_num;

public class neonArray {
	public static void main(String[] args) {
		int[] a = {0,9,1,11,8,};
		for(int i:a) {
			if(isNeon(i)) {
				System.out.println(i);
			}
		}
	}
	public static boolean isNeon(int n) {
		int sum = 0;
		int sq = n*n;
		if(n==0) {
			return true;
		}
		while(sq!=0) {
			int rem=sq%10;
			sum = sum + rem;
			sq=sq/10;
		}
		return sum==n;
	}
}
