package happy_num;

public class happynum {
	public static void main(String[] args) {
		
	
int []a= {1,2,39,4,49,5,6,49,69};
for(int i=0;i<a.length;i++) {
	if(happyNum(a[i])) {
		System.out.println("Happynum:="+a[i]);
	}}
}
//	public static int happywhile(int []a) {
//int i =0;
//while(i<a.length) {
//	if(happyNum(a[i]))
//		System.out.println(a[i]);
//}i++;
//	}
//


public static boolean happyNum(int n) {
	
while(n>9) {
	int sum =0;
	while(n!=0) {
		int r = n%10;
		sum+=r*r;
		n= n/10;
	}
	n=sum;
}
return n==1||n==7;
}
}


