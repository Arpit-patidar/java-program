package revars02_01_26;

import java.util.Arrays;

public class revEle {
	public static void main(String[] args) {
		
		
		int []a= {1,2,3,4,5};
		System.out.println(Arrays.toString(revEle(a)));
		System.out.println(Arrays.toString(RevEle(a)));
		System.out.println(avg(a));
	}
	public static int[]revEle(int[]a){
		int start=0;
		int end=a.length-1;
//		while(start<=end) {
//			int temp = a[start];
//			a[start]=a[end];
//			a[end]=temp;
//			start++;
//			end--;
//			
//		}
		//normal without temp variable
		while(start<end){
			a[start]=a[start]+a[end];
			a[end]=a[start]-a[end];
			a[start]= a[start]-a[end];
start++;
end--;

		}
		return a;
	}
	//WAP to avrage 
	public static int avg(int []a) {
		int sum= 0;
		for(int arr:a) {
			sum+=arr;
		}
		return sum/a.length;
	}
	//index 
	public static int[]RevEle(int[]a){
		int []res = new int[a.length];
		int index=0;
		for(int i= a.length-1;i>=0;i--) {
			res[index]=a[i];
			index++;
		}
		return res;
	}
	// We how Take the new array only even Element
	
}