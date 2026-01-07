package happy_num;

public class sunnyArray {
    public static void main(String[] args) {
        int[] a = {3, 8, 15, 24, 35, 37, 38, 39, 80};

        for (int i = 0; i < a.length; i++) {
            if (isSunny(a[i])) {
                System.out.println("Sunny elements :" + a[i]);
            }
        }
    }
    public static boolean isSunny(int n) {
    	
    	int x = n+1;
    	for(int i=1;i*i<=x;i++) {
    		if(i*i == x) {
    			return true;
    		}
    	}
    	return false;
    }
}