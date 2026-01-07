package Array03_01_26;

public class secondmaxele {
public static void main(String[] args) {
	int []a= {1,2,3,4,5};
	System.out.println("second max "+secondmax(a));
}
public static int secondmax(int []a) {
	int max =a[0];
	int max2= a[0];

	for(int i =0;i<a.length;i++) {
		if(a[i]>max) {
			max2=max;
			max=a[i];
	}
	
	else if(a[i]>max2 && a[i]<max)
		max2= a[i];
}return max2;
		

}
}
