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

		System.out.println(id + "�� �Խù��� �ԷµǾ����ϴ�.");

		System.out.println("1.��� " + "2.��� " + "3.���� " + "4.���� " + "0.����");
	}
}