package board;

import java.util.Scanner;
import java.util.Set;

public class Contents extends Board {

	public Contents() {

	}

	protected void action() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();

		Set<Integer> ks = articleMap.keySet();

		for (Integer n : ks) {
			if (n == num) {
				System.out.println(n + "  " + articleMap.get(n).toString());
				break;
			}

			else {
				System.out.println("등록된 게시물이 없습니다.");

			}
		}

	}
}
