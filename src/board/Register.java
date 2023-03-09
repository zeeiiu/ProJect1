package board;

public class Register extends Board {
	int id;
	String title;
	String contents;
	String name;
	String date;

	public Register(int id, String title, String contents, String name, String date) {
		this.id = id;
		this.title = title;
		this.contents = contents;
		this.name = name;
		this.date = date;

	}

	public void update() {

		articleMap.put(id, new Article(title, contents, name, date));

		System.out.println(id + "번 게시물이 입력되었습니다.");

		System.out.println("1.목록 " + "2.등록 " + "3.내용 " + "4.삭제 " + "0.종료");
	}
}