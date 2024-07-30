package rtg.learning.junit;

public class MyMath {
	
	public int calculateSum(int[] arr) {
		int sum=0;
		for(int ele:arr) {
			sum+=ele;
		}
		return sum;
	}
}
