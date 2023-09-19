import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ForkJoinTask;

import javax.print.attribute.SetOfIntegerSyntax;

public class Curious {

	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			int cnt = 0;
			for (int j = i; j>=1; j--) {
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				System.out.println(i);
			}
		}
	}
}