package unionOfArr10_01_26;

public class searchEle {
	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 6, 7 };
		System.out.println(search(a, 5));
		System.out.println(recSearch(a, 5, 0));
	}

	public static int search(int[] a, int n) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				return i;
			}
		}
		return -1;
	}

	public static int recSearch(int[] a, int ele, int index) {

		if (index == a.length)
			return -1;

		if (a[index] == ele)
			return index;
		return recSearch(a, ele, index + 1);
	}
}
