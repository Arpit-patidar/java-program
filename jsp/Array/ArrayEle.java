package jsp.Array;

public class ArrayEle {
	public static void main(String[] args) {
		int []a= new int[3];
		a[0]= 10;
		a[1]= 20;
		a[2]= 30;
		int i = 0;
		while(i<a.length) {
			System.out.println(a[i]);
			i++;
		}
	}

}

