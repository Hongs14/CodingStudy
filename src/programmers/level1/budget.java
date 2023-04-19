package programmers.level1;

import java.util.Arrays;

public class budget {

	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;
		int answer = 0;
		int sum=0;
		
		Arrays.sort(d);
		
		for(int j=0; j<d.length;j++) {
			sum = sum + d[j];
	        if(budget - sum >= 0) {
	           answer += 1;
	        }
		}
		
		System.out.println(answer);

	}

}
