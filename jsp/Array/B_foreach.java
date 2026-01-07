package jsp.Array;

public class B_foreach {
	public static void main(String[] args) {
		int []a= new int[3];
		a[0]= 10;
		a[1]= 20;
		a[2]= 30;
		int i = a.length - 1;
		do {
		    System.out.println(a[i]);
		    i--;
		} while (i >= 0);


}}