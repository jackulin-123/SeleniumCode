package Week1_day2;

import java.util.Arrays;

public class FindMissingElement {
	public static void main(String[] args) {
		
		int[] input = {1,4,3,2,8,6,7};
		
		Arrays.sort(input);
		for (int i = 0; i < input.length; i++) {
			if (input[i]!=i+1) {
				System.out.println("Missing number is " +(i+1));
				break;
				
				
			}
			
		}
		
		
	}

}