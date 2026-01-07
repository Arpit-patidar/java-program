package jsp.Array;

public class B_while {
	public static void main(String[] args) {
		int []a= new int[3];
		a[0]= 10;
		a[1]= 20;
		a[2]= 30;
		int i = a.length - 1;
		while (i >= 0) {
		    System.out.println(a[i]);
		    i--;
		}

		}
	}


