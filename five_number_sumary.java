package mathe;

import java.util.*;

/***
 * 
 *  Program Definition: Write a java program to find smallest value,
 *  first quartile, median, third quartile, and largest value 
 *  
***/
class five_num {

	public static void main(String[] args) {
		int q1, q3,i=0;
		float smallest, first_quartile, m, third_quartile, largest,median;
		
		Scanner scan = new Scanner(System.in);
		
		//storing inputs into array of string, spliting by space.
		String[] input = scan.nextLine().split("\\s+");
//		String[] words = input.split("\\s+");
		
		
		//declaring numbers array
		float[] numbers = new float[input.length];
		
		//converting string array to integer array.
		for(String nums : input) {
			numbers[i] = Float.parseFloat(nums);
			i++;
		}

		Arrays.sort(numbers);		//sort in ascending.	import java.util.Arrays;
		System.out.println("Sorted: " +Arrays.toString(numbers));
		
		//smallest
		smallest = numbers[0];
		
		//first quartile
		q1 = (int) (0.25*numbers.length);		//  25 / 100 * total(n)
		first_quartile = (numbers[q1-1]+numbers[q1])/2;
		
		//median
		m = (float)(numbers.length + 1) / 2;		//  total(n) + 1 / 2
		if(m == (int)m) {							//if whole number, take that observation
			System.out.println((int)m-1);
			median = numbers[(int)m-1];
		}else {									//else that observation + next one.
			median = (numbers[(int)m-1] + numbers[(int)m])/2;
		}
		
		//third quartile
		q3 = (int)(0.75*numbers.length);		//75 / 100 * total(n)
		third_quartile = (numbers[q3-1]+numbers[q3])/2;
		
		//largest
		largest = numbers[numbers.length-1];
		
		//print them
		System.out.printf("\nSmallest number: %.2f", smallest);
		System.out.printf("\nFirst Quartile: %.2f", first_quartile);
		System.out.printf("\nMedian: %.2f", median);
		System.out.printf("\nThird Quartile: %.2f", third_quartile);
		System.out.printf("\nLargest number: %.2f", largest);	
	}
}