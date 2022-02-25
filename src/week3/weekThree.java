package week3;

public class weekThree {
	int numbers[] =  {1,2,3,4,5,6,7,8,9};
	public  int findSmallest(String num) {
		String[] a = num.split("");
		for(int i = 0 ; i<a.length; i++) {
			int n = Integer.parseInt(a[i]);
			numbers[n-1]=0;
		}
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>0) {
				return numbers[i];
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		weekThree obj = new weekThree();
		weekThree object = new weekThree();
		int res = obj.findSmallest("1689");
		int results = object.findSmallest("689345");
		System.out.println("Output for first input:"+ res);
		System.out.println("Output for second input:"+results);
	}
}