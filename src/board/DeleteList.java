package board;

import java.util.Scanner;

public class DeleteList extends Board {
	int id;

	public DeleteList(int id) {
		this.id = id;
	}

	protected void clear() {
		Scanner sc = new Scanner(System.in);
		int delete = sc.nextInt();
		sc.nextLine();

		if (id < delete) {
			System.out.println("삭제할 게시물이 없습니다.");

		} else {
			articleMap.remove(delete);
			System.out.println(delete + "번 게시물이 삭제 되었습니다.");

		}

	}

}
