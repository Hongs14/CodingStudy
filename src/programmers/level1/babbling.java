package programmers.level1;

public class babbling {
	public static void main(String[] args) {
		String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
//		String[] babbling = {"aya", "yee", "u", "maa", "wyeoo", "ayayemawoo"};
		String[] speackable = {"aya", "ye", "woo", "ma"};
		int answer = 0;
		
		for(int i=0; i<babbling.length; i++) {			
			for(String talk:speackable) {
				if(babbling[i].contains(talk)) {
					babbling[i] = babbling[i].replace(talk,"!");
					
				}
			}
			
		}
		//wyeoo의 경우 ye가 사라지면 woo가 되어 사라짐.
		
		for(String a:babbling) {	
//			System.out.println(a);
			if(a.contains("!")) {
				int check = a.length() - a.replace("!", "").length();
				if(check == a.length()) {
					answer++;
				}
			}
				
		}
		
		System.out.println(answer);
	}
}
