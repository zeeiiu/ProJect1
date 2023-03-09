package board;

class Article { // 게시물 생성시 고객에게 입력받은 새 게시물 정보를 article객체에 넣어주기.

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