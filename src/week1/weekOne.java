package week1;

import java.util.Arrays;

public class weekOne {
	public int k;
	public int[] input;
	public  String output;
	public int count ;
	
	public weekOne(int k,int[] input){
		this.k=k;
		this.input=input;
		this.output="";
		count=0;
		expression(0,0,0," ");
	}

	public void expression(int pos,int prev,int res, String expr) {
		if(pos==input.length) {
			if(res==k) {
				output+=expr+' ';
				count++;
			}
			return;
		}
		int nthnum = input[pos];

		if(pos==0) {
			expression(pos+1,nthnum,nthnum,""+nthnum);
		}
		else{
			expression(pos+1,nthnum,res+nthnum,expr+"+"+nthnum);
			expression(pos+1,nthnum,res-nthnum,expr+"-"+nthnum);
			expression(pos+1,prev*nthnum,res-prev+prev*nthnum,expr+"*"+nthnum);
		}
		if(count==0) {
			output="There cannot be any combination of +,-,* with input array : " + Arrays.toString(input) + " to reach target : "+ k;
		}
	}

public static void main(String[] args) {
	weekOne obj=new weekOne(15,new int[]{3,4,3});
		System.out.print(obj.output);
	}
}