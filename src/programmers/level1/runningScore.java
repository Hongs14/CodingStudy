package programmers.level1;

import java.util.HashMap;

public class runningScore {

	public static void main(String[] args) {
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		
		String[] answer = {};
		answer = new String[players.length];
		
		for(int k=0; k<players.length; k++){
	            answer[k] = players[k];
		}
		
		//이중포문 사용 -> 시간초과
//		for(int i=0; i<callings.length; i++) {
//			for(int j=0;j<answer.length;j++) {
//				if(callings[i].equals(answer[j])) {
//					String temp = answer[j-1];
//					answer[j] = temp;
//					answer[j-1] = callings[i];
//				}
//			}
//		}
		
//		 for(String a:answer) {
//			 System.out.println(a);
//		 }
		
		HashMap map = new HashMap<Integer, String>();
				
		for(int i=0;i<players.length;i++) {		
			map.put(i, (String)players[i]);
		}
			
		System.out.println("--------------------------------");
		for(int j=0; j<callings.length; j++) {
			if(map.containsValue(callings[j])) {
				System.out.println("j: "+j);
				String temp = (String) map.get(j-1);
				System.out.println("temp: "+temp);
				map.replace((int)j-1, map.get(j));
				map.replace(j, temp);
			}
		}
		
		for(int a=0;a<map.size();a++) {
			System.out.println(map.get(a));
		}
		
		 
	
	}

}
