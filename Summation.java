package concurrency;

class Summation extends Thread {
	int s;
	
	public Summation(int[] arr, int i, int min) {
	}
	
	public int getSum()

	{

	return s;

	}
	public static int sum(int[] arr)
	{
		int sum = 0;
		for (int value : arr) {
			sum+= value;
		}
		return sum;
	}
	
	public static int parallelSum(int[] arr, int threads)
	{
		int length = (int) Math.ceil(1.0 * arr.length / threads);
		Summation[] summation = new Summation[threads];
		Thread[] thread = new Thread[threads];
		for (int i=0; i <threads; i++) {
			summation[i] = new Summation(arr, i*length, Math.min((i+1)*length, arr.length));
			thread[i] = new Thread(summation[i]);
			thread[i].start();
		}
		try {
			for (Thread t : thread) {
				t.join();
			}
		}catch (InterruptedException ie) {
		}
		int total = 0;
		for (Summation sum : summation) {
			total += sum.getSum();
		}
		return total;
		
	}
}
