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

		System.out.println("======== 게시판  ========");
		System.out.println(" 번호     제목     작성자     작성일 ");
		System.out.println("----------------------");
		System.out.println("1.목록 " + "2.등록 " + "3.내용 " + "4.삭제 " + "0.종료");

		int id = 0;
		String title = null;
		String contents = null;
		String name = null;

		while (true) {
			try {

				Scanner sc = new Scanner(System.in);
				System.out.print("번호를 입력하세요.> ");
				int number = sc.nextInt();
				sc.nextLine();

				if (number == 0) {
					sc.close();

					break;
				} else if (number == 1) {
					System.out.println("----------------------");
					System.out.println(" 번호 " + "  " + " 제목 " + "  " + " 작성자 " + "  " + " 작성일 ");
					System.out.println("----------------------");
					System.out.println("1.목록 " + "2.등록 " + "3.내용 " + "4.삭제 " + "5.종료");
					if (id == 0) {
						System.out.println("게시물이 없습니다.");
					} else {

						HashMapFunction hashMapFunction = new HashMapFunction();
						hashMapFunction.run();

					}

				} else if (number == 2) {
					System.out.println("등록하세요.");
					System.out.print("제목 : ");
					title = sc.nextLine();
					System.out.print("내용 : ");
					contents = sc.nextLine();
					System.out.print("작성자 : ");
					name = sc.nextLine();
					System.out.println("작성일 : " + date);

					id++;
					Register register = new Register(id, title, contents, name, date);
					register.update();

				} else if (number == 3) {

					System.out.println("몇 번 째 게시물을 선택 하시겠습니까? : ");
					System.out.println(" 번호 " + "  " + " 제목 " + "  " + " 작성자 " + "  " + " 작성일 ");
					System.out.println("----------------------");

					HashMapFunction hashMapFunction = new HashMapFunction();
					hashMapFunction.run();

					Contents in = new Contents();
					in.action();

				}

				else if (number == 4) {

					System.out.print("삭제할 게시물 번호를 입력하세요 : ");
					DeleteList dl = new DeleteList(id);

					dl.clear();

				}

				else if (number < 0 || number > 4) {
					System.out.println("게시물 번호를 잘못 입력했습니다.");
				}

			} catch (InputMismatchException e) {
				System.out.println("번호 이외에 입력할 수 없습니다. 번호를 입력해주세요.");

			}

		}
		System.out.println("======== 프로그램 종료 ========");
	}

}
