package SumOfEle;

public class Sum_while {
	public static void main(String[] args) {
		int []a= {1,3,3,4,6};
		System.out.println("sunofele="+sunofele(a));
		System.out.println("sunofdo="+sunofdo(a));
		System.out.println("sumOffor="+sunofdo(a));
	}
public static int sunofele(int[]a) {
	int sum =0;
	int i = 0;
	while(i<a.length) {
		if(a[i]%2==0) {
			sum+=a[i];
		}
	i++;
}
	return sum;

}
public static int sunofdo(int[]a) {
	int sum = 0;
	int i = 0;
	do {
		if(a[i]%2==0) {
			sum+=a[i];
		}
		i++;
	}while (i<a.length);
	return sum;
}
public static int sumOffor(int[]a) {
	int sum = 0;
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			sum+=a[i];
		}
		
	}
	return sum;
}
}
