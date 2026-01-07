package Array03_01_26;

import java.util.Arrays;
import java.util.Scanner;

public class first10prime {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("form where you want 10 prime element");
	
	System.out.println(Arrays.toString(primenum()));
	
}
public static int[] primenum() {
int[] prime =new int[10];
int num=2;
int count=0;
while(count<10) {
	if(primenum(num)) {
		prime[count++]=num;
	}
	num++;
}
return prime;
}

public static boolean primenum(int a ) {
	int count = 0;
//	boolean flag= true ;
	for(int i = 1;i<=a;i++) {
		if(a%i==0) {
			count++;
		}
	}
	return count==2;
}
}
