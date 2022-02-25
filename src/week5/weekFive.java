package week5;

import java.util.Arrays;

public class weekFive {
	 public static int[] sortMartix(int mat[][]) {
		int pos=0;
		int temp[]=new int[(mat.length)*(mat[0].length)];
		 for(int i=0;i<mat.length;i++) {
			 for(int j=0;j<mat[0].length;j++) {
				 temp[pos] = mat[i][j];
				 pos++;
			 }
		 }
		 Arrays.sort(temp);
		 return temp;
	 }
	 
	 public static int[][] assignRank(int mat[][],int sortedMatrixArray[]) {
		 int rankMat[][]=new int[mat.length][mat[0].length];
		 for(int i=0;i<rankMat.length;i++) {
			 for(int j=0;j<rankMat[0].length;j++) {
				 rankMat[i][j]=0;
			 }
		 }
		 for(int x=0;x<sortedMatrixArray.length;x++) {
			 int rank= calculateRank(sortedMatrixArray[x],rankMat,mat);
			 for(int i=0;i<rankMat.length;i++) {
				 for(int j=0;j<rankMat[0].length;j++) {
					 if(sortedMatrixArray[x]==mat[i][j]) {
						 rankMat[i][j]=rank;
					 }
				 }
			 }
		 }
		 return rankMat;
	 }
	 
	 public static int calculateRank(int value,int rankMat[][],int mat[][]) {
		 int count=0;
		 int max=0;
		 for(int i=0;i<mat.length;i++) {
			 for(int j=0;j<mat[0].length;j++) {
				 if(value==mat[i][j] && rankMat[i][j]==0) {
					 for(int col=0;col<rankMat[0].length;col++) {
						 if(max<=rankMat[i][col]) {
							 max=rankMat[i][col];
						 }
					 }
					 for(int row=0;row<rankMat.length;row++) {
						 if(max<=rankMat[row][j]) {
							 max=rankMat[row][j];
						 }
					 }
					if(count==0) {		 
						 count++;
						 max++;
					 }
				 }
				 else if(value==mat[i][j] && rankMat[i][j]>0){
					 for(int col=0;col<rankMat[0].length;col++) {
						 if(max<=rankMat[i][col]) {
							 max=rankMat[i][col];
						 }
					 }
					 for(int row=0;row<rankMat.length;row++) {
						 if(max<=rankMat[row][j]) {
							 max=rankMat[row][j];
						 }
					 }
				 }
			 }		
						 
		 }
		 return max;
	 }
	 public static void print(int mat[][]) {
		 for(int i=0;i<mat.length;i++) {
			 for(int j=0;j<mat[0].length;j++) {
				 System.out.print(" "+mat[i][j]);
			 }
			 System.out.println();
		 }
	}
	
	
	public static void main(String[] args) {
		
		int arr[][] = new int[][]{{2,3},{3,4}};
		
		int sorted[] = sortMartix(arr);
		
		int rankMat[][]=assignRank(arr, sorted);
		print(rankMat);
	}
}