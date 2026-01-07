package Arrays;

import java.util.Arrays;

public class CopyOf {
public static void main(String[] args) {
	char[] c= {'a','b','c'};
	char[]copy= Arrays.copyOf(c, c.length);
	System.out.println(Arrays.toString(copy));
	
}
}
