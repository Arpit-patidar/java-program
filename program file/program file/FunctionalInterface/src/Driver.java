public class Driver{
	
	public static void main(String[] args) {
		System.out.println("Interface1 output");
		Interface1 i1 = () -> {
			System.out.println("m1");
		};
		i1.m1();
		System.out.println();
		System.out.println("Interface2 output");
		Interface2 i2 = (a,b) -> {
			int sum = a+b;
			System.out.println("Sum is :"+sum);
		};
		i2.addition(10,20);
		System.out.println();
		System.out.println("Interface3 output");
		Interface3 i3 = (a,b) -> {
			int sum = a+b;
			System.out.println("Sum is :"+sum);
		};
		i3.addition(10,20);
		Interface3.subtract(10,6);
		System.out.println();
		System.out.println("Interface4 output");
		Interface4 i4 = (int a) -> {
			if(a%2==0) {
				System.out.println("Even");
			}
			else {
				System.out.println("Odd");
			}
		};
		i4.isEven(29);
		System.out.println();
		System.out.println("Interface5 output");
		Interface5 i5 = (int a, int b) -> {
        	System.out.println(a%b==0);
        };
        i5.isDivisible(10, 5);
        System.out.println();
        System.out.println("Interface6 output");
		Interface6 i6 = (int n) -> {
			int rev = 0,temp = n;
			while(n!=0) {
				int r = n%10;
				rev = rev *10 + r;
				n = n/10;
			}
        	System.out.println(rev==temp);
        };
        i6.isPalindrome(105);
        System.out.println();
        System.out.println("Interface7 output");
		Interface7 i7 = () -> {
			for(int i=1;i<=5;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		};
		i7.m2();
		System.out.println();
        System.out.println("Interface8 output");
		Interface8 i8 = (int a,int b,int c) -> {
			if(a>b && a>c) {
				System.out.println("a is greatest i.e : "+a);
			}
			else if(b>a && b>c) {
				System.out.println("b is greatest i.e : "+b);
			}
			else {
				System.out.println("c is greatest i.e : "+c);
			}
		};
		i8.greatest(90,20,30);
		System.out.println();
        System.out.println("Interface9 output");
		Interface9 i9 = (int a,int b,int c,int d) -> {
			int big = (a>b && a>c && a>d)?a :(b>c && b>d)?b : (c>d)?c :d;
				System.out.println("Greatest of all 4 is :"+big);
			
		};
		i9.biggest(90,20,30,100);
		System.out.println();
        System.out.println("Interface10 output");
		Interface10 i10 = (int y) -> {
			if((y%4==0 && y%100 !=0) || (y%400 ==0) ){
				System.out.println(y+" is a leap year");
			}
			else {
				System.out.println(y+" is not a leap year");
			}
		};
		i10.m3(2020);
	}
}
