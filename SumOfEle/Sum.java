package SumOfEle;

public class Sum {
public static void main(String[] args) {
	int []a= {1,2,4,3};
	System.out.println("sum of:="+sumofele(a));
	System.out.println("sum of while="+sumofbywhile(a));
	System.out.println("sum od do="+sumofbydo(a));
}
public static int sumofele(int []a){
	int sum =0;
	for(int i=0;i<a.length;i++)
		if(a[i]%2==0) {
			sum+=a[i];
		}
	return sum;
}
public static int sumofbywhile(int[]a) {
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
public static int sumofbydo(int[]a) {
	int sum =0;
	int i = 0;
	do {
		if(a[i]%2==0) {
			sum+=a[i];
		}
	i++;
}while(i<a.length);
	return sum;
	}

}
