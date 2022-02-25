package week7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class weekSevenTest {

	@Test
	void test1() {
			weekSeven.Node root = null;
		    root = weekSeven.insert(root, 50);
		    weekSeven.insert(root, 30);
		    weekSeven.insert(root, 20);
		    weekSeven.insert(root, 40);
		    weekSeven.insert(root, 70);
		    weekSeven.insert(root, 60);
		    weekSeven.insert(root, 80);


		    weekSeven.inorder(root);
		    int res= weekSeven.check();

		    assertEquals(res,2);
	}
	@Test
	void test2() {
			weekSeven.Node root = null;
		    root = weekSeven.insert(root, 50);
		    weekSeven.insert(root, 30);
		    weekSeven.insert(root, 20);
		    weekSeven.insert(root, 40);
		    weekSeven.insert(root, 70);
		    weekSeven.insert(root, 60);
		    weekSeven.insert(root, 80);
		    weekSeven.insert(root, 120);
		    weekSeven.insert(root, 130);



		    weekSeven.inorder(root);
		    int res= weekSeven.check();

		    assertEquals(res,3);
	}

}