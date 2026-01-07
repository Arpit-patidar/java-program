package frequencyOfEle06_01_26;

public class frequencyEle {
	public static void main(String[] args) {
		int[]a= {1,3,2,2,4,5,5};
		freqency(a);
	}
	public static void freqency(int[]a) {
		boolean[] visited = new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			if(visited[i])
				continue;
			 int count =1;
			 for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					count++;
				visited[j]=true;
			}
//			 if(count>1)
			 }System.out.println(a[i]+" paresnt " + count + " time");
		}
		
	}
}
