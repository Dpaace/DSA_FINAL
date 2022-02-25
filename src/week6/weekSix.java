package week6;

import java.util.HashMap;


public class weekSix {
	static int[][] findVisitedPoints(int arr[][]) {
		int visited[][]=new int[10][10];
		for(int i=0;i<visited.length;i++) {
			for(int j=0;j<visited[0].length;j++) {
				visited[i][j]=0;
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(j>0) {
					visited[arr[i][j-1]][arr[i][j]]=1;
					visited[arr[i][j]][arr[i][j-1]]=1;
				}
			}
		}
		return visited;
	}
	static HashMap<Integer, Integer> findCriticalPaths(int visited[][]) {
		HashMap<Integer, Integer> criticalPoints = new HashMap<Integer, Integer>();
		int temp=0;

		for(int i=0;i<visited.length;i++) {
			int count=0;
			for(int j=0;j<visited[0].length;j++) {
				if(visited[i][j]==1) {
					count++;
					temp=j;
				}
			}
			if(count==1) {
				criticalPoints.put(temp, i);
			}
		}
		return criticalPoints;
	}
	
	public static void main(String[] args) {
		
		int visited[][]=findVisitedPoints(new int[][] {{0,1},{1,6},{0,3},{0,2},{2,3},{2,5}});
		HashMap<Integer, Integer> criticalPoints = findCriticalPaths(visited);
		
		criticalPoints.entrySet().forEach(entry -> {
		    System.out.println("{"+entry.getKey() + ", " + entry.getValue()+"}");
		});
	}
}