package day15;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Tester {
	static boolean grading(String s1, String s2) {  // s1:input, s2:answer
		// 정답에 '또는'(||)이 포함된 경우
		if(s2.indexOf("||") > -1) {
			String[] arrAnswers = s2.split("\\|\\|");
			s1 = s1.replace(" ", "").replace("-", "").toLowerCase();
			for(int i=0; i<=arrAnswers.length-1; i++) {
				String s3 = arrAnswers[i].replace(" ", "").replace("-", "").toLowerCase();
				if(s1.equals(s3))
					return true;
			}
			return false;
		// 컴마(,) 답안인 경우
		} else if(s2.indexOf(",") > -1) {
			String[] arrS1 = s1.split(",");
			String[] arrS2 = s2.split(",");
			if(arrS1.length!=arrS2.length) 
				return false;

			for(int i=0; i<=arrS1.length-1; i++) {
				arrS1[i] = arrS1[i].replace(" ","").replace("-","").toLowerCase();
			}
			for(int i=0; i<=arrS2.length-1; i++) {
				arrS2[i] = arrS2[i].replace(" ","").replace("-","").toLowerCase();
			}
			
			int cnt = 0;
			for(int i=0; i<=arrS1.length-1; i++) {
				for(int j=0; j<=arrS2.length-1; j++) {
					if(arrS1[i].equals(arrS2[j])) {
						cnt++;
						break;
					}
				}
			}
			if(cnt==arrS1.length) 
				return true;
			else
				return false;
		}
		// 일반적인 답안인 경우.
		if(s1.replace(" ", "").replace("-", "").toLowerCase().equals(s2.replace(" ", "").replace("-", "").toLowerCase()))
			return true;
		return false;
	}
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new FileReader("tester202309.txt"));
		int cnt = 0;
		String str = null;
		while((str=reader.readLine())!=null) {
			cnt++;
		}
		reader.close();
		
		System.out.println("<" + cnt + "개>의 문제를 읽어왔습니다.");

		String[] questions = new String[cnt];
		String[] answers = new String[cnt];
		reader = new BufferedReader(new FileReader("tester202309.txt"));
		for(int i=0; i<=cnt-1; i++) {
			str = reader.readLine();
			questions[i] = str.split("\t")[0];
			answers[i] = str.split("\t")[1];
		}
		reader.close();

		// Make an array of the orders.
		int[] arrIdxOrders = new int[cnt];
		for(int i=0; i<=cnt-1; i++) {
			arrIdxOrders[i] = i;
		}
		
		// Shuffle.
		for(int i=0; i<=cnt/2; i++) {
			int idx1 = (int)(Math.random()*cnt);
			int idx2 = (int)(Math.random()*cnt);
			if(idx1 != idx2) {
				String t = questions[idx1];
				questions[idx1] = questions[idx2];
				questions[idx2] = t;
				t = answers[idx1];
				answers[idx1] = answers[idx2];
				answers[idx2] = t;
			}
		}
		
		System.out.println("<START!>");
		long start, end;
		int correct = 0;   // count which is correct.
		start = System.currentTimeMillis();
		for(int i=0; i<=cnt-1; i++) {
			System.out.print(i+1 + ") " + questions[i] + " = ");
			String input = sc.nextLine();
			
			if(grading(input,answers[i])) {
				correct++;
				System.out.println("(O)");
			} else {
				System.out.println("(X) 정답 = " + answers[i]);
			}
		}
		end = System.currentTimeMillis();
		System.out.println("<Finish!> \n\t" + cnt + "개 중에서 " + correct + "개 맞춤!");
		System.out.println("\t(소요시간 : " + (end-start)/1000.0 + "초)");
		
	}
}
