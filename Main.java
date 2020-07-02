package concurrency;

import java.util.Random;

public class Main {
	static int[] arr = new int[200000000];
	public static void main(String[] args)
	{
		Random rand = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10);
		}
		long start = System.currentTimeMillis();
		System.out.println("Sum: " + Summation.sum(arr));
		System.out.println("Time for single thread summation: " + (System.currentTimeMillis() - start) + " ms" );
		start = System.currentTimeMillis();
		System.out.println("Sum: " + Summation.parallelSum(arr, Runtime.getRuntime().availableProcessors()));
		System.out.println("Time for parallel summation: " + (System.currentTimeMillis() - start) +" ms");

	}

}
