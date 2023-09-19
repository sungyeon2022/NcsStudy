import java.util.Arrays;

class Test20230919{
	public static void main(String[] args){
		int[] arr = {1,2,5,7,3,-1,4};
		int min = 0;
		int max = 0;
		int sum = 0;
		for(int i = 0;i<arr.length;i++){
			if(i==0){
				min = arr[i];
				max = arr[i];
			}
			sum+= arr[i];
			if(i!=0){
				if(min>arr[i]) min = arr[i];
				if(max<arr[i]) max = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("최대 값 : "+max);
		System.out.println("최소 값 : "+min);
		System.out.println("평균 : "+(double)sum/arr.length);
		
	}
}