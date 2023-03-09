package board;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Board {

	static Map<Integer, Article> articleMap = new HashMap<>();

	public static void main(String[] args) {

		SimpleDateFormat dt = new SimpleDateFormat("[yy/MM/dd] [HH:mm]");
		String date = dt.format(new Date());

		System.out.println("======== �Խ���  ========");
		System.out.println(" ��ȣ     ����     �ۼ���     �ۼ��� ");
		System.out.println("----------------------");
		System.out.println("1.��� " + "2.��� " + "3.���� " + "4.���� " + "0.����");

		int id = 0;
		String title = null;
		String contents = null;
		String name = null;

		while (true) {
			try {

				Scanner sc = new Scanner(System.in);
				System.out.print("��ȣ�� �Է��ϼ���.> ");
				int number = sc.nextInt();
				sc.nextLine();

				if (number == 0) {
					sc.close();

					break;
				} else if (number == 1) {
					System.out.println("----------------------");
					System.out.println(" ��ȣ " + "  " + " ���� " + "  " + " �ۼ��� " + "  " + " �ۼ��� ");
					System.out.println("----------------------");
					System.out.println("1.��� " + "2.��� " + "3.���� " + "4.���� " + "5.����");
					if (id == 0) {
						System.out.println("�Խù��� �����ϴ�.");
					} else {

						HashMapFunction hashMapFunction = new HashMapFunction();
						hashMapFunction.run();

					}

				} else if (number == 2) {
					System.out.println("����ϼ���.");
					System.out.print("���� : ");
					title = sc.nextLine();
					System.out.print("���� : ");
					contents = sc.nextLine();
					System.out.print("�ۼ��� : ");
					name = sc.nextLine();
					System.out.println("�ۼ��� : " + date);

					id++;
					Register register = new Register(id, title, contents, name, date);
					register.update();

				} else if (number == 3) {

					System.out.println("�� �� ° �Խù��� ���� �Ͻðڽ��ϱ�? : ");
					System.out.println(" ��ȣ " + "  " + " ���� " + "  " + " �ۼ��� " + "  " + " �ۼ��� ");
					System.out.println("----------------------");

					HashMapFunction hashMapFunction = new HashMapFunction();
					hashMapFunction.run();

					Contents in = new Contents();
					in.action();

				}

				else if (number == 4) {

					System.out.print("������ �Խù� ��ȣ�� �Է��ϼ��� : ");
					DeleteList dl = new DeleteList(id);

					dl.clear();

				}

				else if (number < 0 || number > 4) {
					System.out.println("�Խù� ��ȣ�� �߸� �Է��߽��ϴ�.");
				}

			} catch (InputMismatchException e) {
				System.out.println("��ȣ �̿ܿ� �Է��� �� �����ϴ�. ��ȣ�� �Է����ּ���.");

			}

		}
		System.out.println("======== ���α׷� ���� ========");
	}

}
