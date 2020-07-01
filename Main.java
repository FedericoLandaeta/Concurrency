package concurrency;

import java.util.Random;

public class Main {
	public static void main(String[] args)
	{
		Random rand = new Random();
		int[] arr = new int[200000000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10);
		}
		long start = System.currentTimeMillis();
		System.out.println("Sum: " + Summation.sum(arr));
		System.out.println("Time for single thread summation: " + (System.currentTimeMillis() - start) + " ms" );
		//start = System.currentTimeMillis();
		//System.out.println("Sum: " + Summation.parallelSum(arr));
		//System.out.println("Time for parallel summation: " + (System.currentTimeMillis() - start) +" ms");

	}

}