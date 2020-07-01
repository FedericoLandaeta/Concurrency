package concurrency;

class Summation extends Thread {

	//private int[] arr;
	
	public static int sum(int[] arr)
	{
		int sum = 0;
		for (int value : arr) {
			sum+= value;
		}
		return sum;
	}
	
	/**public static int parallelSum(int[] arr)
	{
		
		return parrallelSum;
		
	}**/
}