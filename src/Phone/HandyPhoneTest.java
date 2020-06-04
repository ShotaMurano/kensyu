package Phone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HandyPhoneTest extends HandyPhone {

	@Test
	void test() {
		HandyPhone hp1 = new HandyPhone();
		hp1.mailAddress = "smurano@gmail.com";
		Assertions.assertEquals("smurano@gmail.com", hp1.mailAddress);
	}
	//
	//	@Test
	//	void test2() {
	//		HandyPhone hp1 = new HandyPhone();
	//		hp1.mailAddress = "smurano@gmail.com";
	//		Assertions.assertEquals("smurano@gmail.com", hp1.getmail());
	//	}

}
