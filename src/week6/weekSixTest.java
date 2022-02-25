package week6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class weekSixTest {

	@Test
	void test1() {
		int visited[][]= weekSix.findVisitedPoints(new int[][] {{0,1},{1,2},{2,0},{1,3}});
		HashMap<Integer, Integer> criticalPoints = weekSix.findCriticalPaths(visited);

		HashMap<Integer, Integer> testCriticalPoints = new HashMap<Integer, Integer>();
		testCriticalPoints.put(1, 3);

		assertEquals(criticalPoints,testCriticalPoints);

	}

	@Test
	void test2() {
		int visited[][]= weekSix.findVisitedPoints(new int[][] {{0,1}});
		HashMap<Integer, Integer> criticalPoints = weekSix.findCriticalPaths(visited);

		HashMap<Integer, Integer> testCriticalPoints = new HashMap<Integer, Integer>();
		testCriticalPoints.put(1, 0);
		testCriticalPoints.put(0, 1);

		assertEquals(criticalPoints,testCriticalPoints);

	}

}