package Phone;

class Phone {
	String no;

	String gettel() {
		return no;
	}

	void tel(String to) {
		System.out.println(no + "から" + to + "へ電話しました");
	}
}
