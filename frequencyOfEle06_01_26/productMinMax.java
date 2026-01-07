package frequencyOfEle06_01_26;

public class productMinMax {
public static void main(String[] args) {
	int[]a = {2,2,4,5,6,7};
	System.out.println(proMax(a)*promin(a));
}
public static int  proMax(int []a) {
	int max = Integer.MIN_VALUE;
	for (int i = 0; i < a.length; i++) {
		if(a[i]>max) {
			max =a[i];
		}
	}
	return max;
}
public static int  promin(int[]a) {
	int min = Integer.MAX_VALUE;
	for (int i = 0; i < a.length; i++) {
		if(a[i]<min) {
			min = a[i];
		}
	}
	return min;
}
 
}
