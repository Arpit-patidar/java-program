package SumOfEle;

public class product_prime {
public static void main(String[] args) {
	
	int []a= {1,3,7,3,9,7,4,5};
	for(int ele:a) {
		if(primepro(ele)) 
			System.out.println("prime ele:="+ele);
		
	}
	System.out.println("prime for:="+primepro(0));
			System.out.println("prime do:="+proofdo(a));
			System.out.println("prime for:="+proOffor(a));
			System.out.println("prime while:="+proofele(a));
//			System.out.println("prime foreach:="+pr(a));
	}

//prime check
public static boolean primepro(int a ) {
 if (a <= 1) return false;
	int count = 0;
	for(int i = 1;i<=a;i++) {
		if(a%i==0) {
			count++;
		}
	}
	return count==2;
}
//while loop
	public static int proofele(int[]a) {
		int pro =1;
		int i = 0;
		while(i<a.length) {
			if(primepro(a[i])) {
				pro*=a[i];
			}
		i++;
	}
		return pro;

	}
	//do-while loop
	public static int proofdo(int[]a) {
		int pro = 1;
		int i = 0;
		do {
			if(primepro(a[i])) {
				pro*=a[i];
			}
			i++;
		}while (i<a.length);
		return pro;
	}
	//for loop
	public static int proOffor(int[]a) {
		int pro = 1;
		for(int i=0;i<a.length;i++) {
			if(primepro(a[i])) {
				pro*=a[i];
			}
			
		}
		return pro;
	}

	
}
//public static  int palinprod(int []a) {
//	int pro =0 ;
//	int i =0;
//	while(i<a.length) {
//		if(ispalindrom(a[i]))
//			pro
//	}
//	i++;
//	return pro;
//}
//
//}
//
//package SumOfEle;
//
//public class product_prime {
//
//    public static void main(String[] args) {
//
//        int[] a = {1, 3, 7, 3, 9, 7, 4, 5};
//
//        for (int ele : a) {
//            if (isPrime(ele)) {
//                System.out.println("Prime element: " + ele);
//            }
//        }
//
//        System.out.println("Prime product (while): " + primeProductWhile(a));
//        System.out.println("Prime product (do-while): " + primeProductDo(a));
//        System.out.println("Prime product (for): " + primeProductFor(a));
//    }
//
//    // Prime check
//    public static boolean isPrime(int n) {
//        if (n <= 1) return false;
//
//        int count = 0;
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) count++;
//        }
//        return count == 2;
//    }
//
//    // while loop
//    public static int primeProductWhile(int[] a) {
//        int pro = 1, i = 0;
//        while (i < a.length) {
//            if (isPrime(a[i])) {
//                pro *= a[i];
//            }
//            i++;
//        }
//        return pro;
//    }
//
//    // do-while loop
//    public static int primeProductDo(int[] a) {
//        int pro = 1, i = 0;
//        do {
//            if (isPrime(a[i])) {
//                pro *= a[i];
//            }
//            i++;
//        } while (i < a.length);
//        return pro;
//    }
//
//    // for loop
//    public static int primeProductFor(int[] a) {
//        int pro = 1;
//        for (int i = 0; i < a.length; i++) {
//            if (isPrime(a[i])) {
//                pro *= a[i];
//            }
//        }
//        return pro;
//    }
//}
