import java.util.Iterator;

public class arrayroll {
	public static void main(String[] args) {
		int[][] arr = {{3,6,2},{1,5,7},{4,9,8}};
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0;i<arr.length;i++) {
			for(int j = arr[0].length-1;j>=0;j--) {
				System.out.print(arr[j][i]+" ");
				
			}
			System.out.println();
		}
		
	}
}
