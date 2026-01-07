package Array03_01_26;

public class secondmin {
public static void main(String[] args) {
	int []a= {1,2,3,4,5};
	System.out.println("second min "+secondmin(a));
}
public static int secondmin(int []a) {
	int min =Integer.MAX_VALUE;
	int min2= Integer.MIN_VALUE;

	for(int i =0;i<a.length;i++) {
		if(a[i]<min) {
			min2=min;
			min=a[i];
	}
	
	else if(a[i]>min && a[i]<min2)
		min2= a[i];
}return min2;
		

}
}
