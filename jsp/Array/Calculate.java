package jsp.Array;

public class Calculate {
public static void main(String[] args) {
	int []a = {1,2,3,4};
	System.out.println("sum ="+sumofArray(a));
}
public static int sumofArray(int []a){
	int sum =0;
	for(int i = 0;i<a.length;i++)
		sum+=a[i];
//		System.out.println(a[i]);
	return sum;
	
}
}
