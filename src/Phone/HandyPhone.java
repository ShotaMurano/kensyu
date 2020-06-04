package Phone;

class HandyPhone extends Phone {

	public String mailAddress;

	//	public String getmail() {
	//		// TODO 自動生成されたメソッド・スタブ
	//		return mailAddress;
	//	}

	void mail(String to) {
		System.out.println(mailAddress + "から" + to + "へ電話しました");
	}

}
