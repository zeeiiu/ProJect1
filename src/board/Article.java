package board;

class Article { // �Խù� ������ ������ �Է¹��� �� �Խù� ������ article��ü�� �־��ֱ�.

	String title, contents, name, date;

	public Article(String title, String contents, String name, String date) {

		this.title = title;
		this.contents = contents;
		this.name = name;
		this.date = date;
	}

	@Override
	public String toString() {
		return title + "  " + contents + "  " + name + "  " + date;

	}

}