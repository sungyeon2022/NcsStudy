
public class arrayij {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("[");
			for (int j = 0; j < arr[0].length; j++) {
				if(j==arr[0].length-1) System.out.print(arr[i][j]);
				else System.out.print(arr[i][j]+" ");
				sum +=arr[i][j];
				if(arr[i][j]>max) max = arr[i][j];
				if(arr[i][j]<min) min = arr[i][j];
				
			}
			System.out.println("]");
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print("[");
			for (int j = 0; j < arr[0].length; j++) {
				if(j==arr[0].length-1) System.out.print(arr[i][j]*10);
				else System.out.print((arr[i][j]*10)+" ");
				
			}
			System.out.println("]");
		}
		System.out.println(sum);
		System.out.println(min);
		System.out.println(max);
		System.out.println((double)sum/(arr.length*arr[0].length));
	}

}
