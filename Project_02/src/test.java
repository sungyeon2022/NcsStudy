import java.util.*;

public class test {

	public static void main(String[] args) {
		double num = 4;
		double result = 0;
		double compare = 0;
		double i = 1;
		double answer= 0;
		while (true) {
			result = compare;
			result += (num/i);
			compare = result;
			i+=2;
			System.out.println(result);
			compare -= (num/i);
			i+=2;
			System.out.println(compare);
			if(Math.floor(result*10000000) == Math.floor(compare*10000000)) {
				answer = (Math.floor(1/Math.floor(result*10000000)) - 1/4);
				break;
			}
			
		}
		System.out.println(answer);
	}
}