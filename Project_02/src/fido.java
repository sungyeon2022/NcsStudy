import java.util.Scanner;

public class fido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b = 1;
		int want = sc.nextInt();
		int cnt = 3;//처음 cnt를 병합한 상태로 진행했음.
		while (true) {
			int c= a+b;
			a=b;
			b=c;
			if(c==want) {
				System.out.print(want+"는 "+cnt+"번째 항입니다.");
				break;
			}
			else if (c>want) {
				System.out.print(want+"는(은) 수열에 존재하지 않는 수입니다.");
				break;
			}
			cnt++;//따라서 처리 이후 추가 되는게 맞음
		}
		
	}

}
