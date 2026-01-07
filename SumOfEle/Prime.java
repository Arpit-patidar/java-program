package SumOfEle;

public class Prime {
public static void main(String[] args) {
	int []a= {1,3,7,3,9,7,4,5};
	for(int ele:a) {
		if(primenum(ele)) 
			System.out.println("prime ele:="+ele);
		
	}
	System.out.println("prime for:="+primenum(0));
			System.out.println("prime sum:="+primesum(a));
			System.out.println("prime while:="+primewhile(a));
			System.err.println("prime foreach:="+primesumforeach(a));
	}

public static boolean primenum(int a ) {
	int count = 0;
//	boolean flag= true;
	for(int i = 1;i<=a;i++) {
		if(a%i==0) {
			count++;
		}
	}
	return count==2;
}
public static int primesum(int[] a) {
	int sum = 0;
	for(int i =0;i<a.length;i++) {
		if(primenum(a[i])) {
			sum+=a[i];
		}
	}
	return sum;
}
public static int primewhile(int[] a) {
	int sum = 0;
	int i =0;
	while(i<a.length) {
		if(primenum(a[i])) {
			sum+=a[i];
		}
		i++;
	}
	return sum;
}
public static int primesumdo(int[] a) {
	int sum = 0;
	int i =0;
	do {
		if(primenum(a[i])) {
			sum+=a[i];
		}
		i++;
	}while(i<a.length);
	
	return sum;
}
public static int primesumforeach(int[] a) {
	int sum = 0;
	for(int arr:a)
		if(primenum(arr)) {
			sum+=arr;
		}
	return sum;
}
}