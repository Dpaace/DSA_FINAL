package week1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class weekOneTest {

	@Test
	void test1() {
		weekOne obj = new weekOne(15,new int[]{3,4,3});
		assertEquals(obj.output,"3+4*3 3*4+3 ");

	}
	@Test
	void test2() {
		weekOne obj = new weekOne(6,new int[]{1,2,3});
		assertEquals(obj.output,"1+2+3 1*2*3 ");

	}
	@Test
	void test3() {
		weekOne obj = new weekOne(20,new int[]{7,2});
		assertEquals(obj.output,"There cannot be any combination of +,-,* with input array : [7, 2] to reach target : 20");

	}

}