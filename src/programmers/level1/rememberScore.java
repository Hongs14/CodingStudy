package programmers.level1;

import java.util.HashMap;

public class rememberScore {
	public static void main(String[] args) {
		String[] name= {"may", "kein", "kain", "radi"};
		int[] yearning = {5, 10, 1, 3};
		String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
		
		HashMap<String, Integer> score = new HashMap<>();
		int[] answer = new int[photo.length];
		
		for(int i=0; i<name.length;i++) {
			score.put(name[i], yearning[i]);
		}
		
		for(int i=0;i<photo.length;i++) {
			int result = 0;
			for(int j=0;j<photo[i].length;j++) {
				if(score.containsKey(photo[i][j])){
					result += (int)score.get(photo[i][j]);
				} else {
					result += 0;
				}
			}
			answer[i] = result;
		}
		
	}
}
