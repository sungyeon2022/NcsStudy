
public class monte {

	public static void main(String[] args) {
		double cnt = 0;
		double isquadrant = 0;
		
		while (true) {
			double x = (Math.random());
			double y = (Math.random());
			if((x*x)+(y*y)<=1) {
				isquadrant++;
			}
			if(cnt++==1_000_000_000_00L) {
				break;
			}
		}
		System.out.print("cnt : "+ cnt + " ");
		System.out.println(isquadrant/cnt*4);
		
		//결과물 cnt : 1.00000000001E11 3.141598334288584
	}

}
