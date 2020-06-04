package Phone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PhoneTest extends Phone {

	@Test
	void test() {
		Phone ph1 = new Phone();
		ph1.no = "555555";
		Assertions.assertEquals("555555", ph1.no);
	}

	//	@Test
	//	void test1() {
	//		Phone ph1 = new Phone();
	//		Assertions.assertEquals("555555", ph1.gettel("555555"));
	//	}

}
