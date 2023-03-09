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
			System.out.println("������ �Խù��� �����ϴ�.");

		} else {
			articleMap.remove(delete);
			System.out.println(delete + "�� �Խù��� ���� �Ǿ����ϴ�.");

		}

	}

}
