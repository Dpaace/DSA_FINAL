package week3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class weekThreeTest {

	@Test
	void test1() {
		weekThree obj = new weekThree();
		int res = obj.findSmallest("1698");
		assertEquals(res,2);
	}
	@Test
	void test2() {
		weekThree obj = new weekThree();
		int res = obj.findSmallest("689345");
		assertEquals(res,1);
	}

}