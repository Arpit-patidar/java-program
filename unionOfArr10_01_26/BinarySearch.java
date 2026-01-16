 package unionOfArr10_01_26;

public class BinarySearch {
public static void main(String[] args) {
	int[]a= {1,2,3,4,5};
	System.out.println(binary(a, 4));
	System.out.println(recbinary(a, 3, 0, a.length-1));
}
public static int binary(int[]a,int ele) {
	int strat =0;
	int end = a.length-1;
	while(strat<=end) {
		
	int mid = (strat+end)/2;
	if(a[mid]==ele) { 
		return mid;
	}else if(a[mid]<ele) {
		strat = mid+1;
	}else if(a[mid]>ele) {
		end = mid-1;
	}
}
	
	return -1;
	}


public static int recbinary(int[]a,int ele,int start,int end) {
if(start>end)
	return -1;
int mid = (start+end)/2;
if(a[mid]==ele) {
	return mid;
}
else if(ele>a[mid]) {
	start = mid+1;
}else if(ele<a[mid]) {
	end = mid-1;
}
return recbinary(a, ele, start, end);
}

}
