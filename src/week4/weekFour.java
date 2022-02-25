package week4;


import java.util.ArrayList;
import java.util.Collections;
public class weekFour {
		public static ArrayList<ArrayList<int[]>> findAllCollinearPoints(int arr[][]) {
			if(arr.length<2) {
				System.out.println("Only one point is not enought to find length");
				return null;
			}
			ArrayList<ArrayList<int[]>> sameline = new ArrayList<ArrayList<int[]>>();
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					ArrayList<int[]> points =new ArrayList<int []>();
					points.add(arr[i]);
					points.add(arr[j]);
					for(int k=j+1;k<arr.length;k++) {
						int x1=arr[i][0];
						int y1=arr[i][1];
						
						int x2=arr[j][0];
						int y2=arr[j][1];
						
						int x = arr[k][0];
						int y = arr[k][1];

						if( (y-y1)*(x2-x1) ==  (y2-y1)*(x-x1)  ) {
							points.add(arr[k]);	
						}	
					}
					sameline.add(points);
				}
			}
			return sameline;
	}
	public static ArrayList<int[]> findMaxPointsInALine(ArrayList<ArrayList<int[]>> pointsInSameLine) {
		if(pointsInSameLine==null) {
			return null;
		}
			int max=0;
			for(int i=0;i<pointsInSameLine.size();i++) {
				int count = pointsInSameLine.get(i).size();
				if (count>max) {
					max=count;
				}
			}

			for(int i=0;i<pointsInSameLine.size();i++) {
				if (pointsInSameLine.get(i).size()==max) {
					return pointsInSameLine.get(i);
				}
			}
			return null;
			
	}
	public  static double findLengthOfLine(ArrayList<int[]> points){
		if(points == null) {
			return 0;
		}
		ArrayList<Double> lengths = new ArrayList<Double>();

		for(int i=0;i<points.size();i++) {
			for(int j=i+1;j<points.size();j++) {
				int x2=points.get(j)[0];
				int y2=points.get(j)[1];
				
				int x1=points.get(i)[0];
				int y1=points.get(i)[1];

				double distance = Math.sqrt(  (Math.pow((x2-x1), 2))+ (Math.pow((y2-y1), 2))  );
				lengths.add(distance);
			}
		}
		double maxLength = Collections.max(lengths);
		return maxLength;
	}
		public static void main(String[] args) {
			int num[][] = { {1,2},{5,5} ,{1,4}, {2,3}, {3,2}, {4,1}, {3,5} };
			
			ArrayList<ArrayList<int[]>> allCollinearPoints = findAllCollinearPoints(num);
			ArrayList<int[]> maxPointsInSameLine = findMaxPointsInALine(allCollinearPoints);
			double length = findLengthOfLine(maxPointsInSameLine);
			System.out.println(Math.round(length*1000.0)/1000.0 );
		}
	}