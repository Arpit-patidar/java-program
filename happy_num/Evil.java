package happy_num;

public class Evil {
public static void main(String[] args) {
	int []a= {2,3,4,6};
	EvilElement(a);
}
public static boolean isEvil(int n) {
	int count=0;
while(n!=0) {
	if(n%2==0) {
		count++;
	}
	n=n/10;

}
return count%2==0;
}
public static void EvilElement(int[]a) {
	for(int arr:a) {
		if(isEvil(arr))
			System.out.println(arr);
	}
}
}
