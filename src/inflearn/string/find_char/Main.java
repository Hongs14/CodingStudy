package inflearn.string.find_char;
import java.util.Scanner;

class Main {
	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		/*첫번째 방법*/
//		for(int i=0; i<str.length();i++) {
//			if(str.charAt(i) == t) {
//				answer++;
//			}
//		}
		/*두번째 방법 - 향상된 포문*/
		for(char x : str.toCharArray()) {
			if(x == t) {
				answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main(); //인스턴스 메소드를 호출하기 위한 객체생성
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char t = sc.next().charAt(0);
		System.out.println(T.solution(str, t)); //return시 출력
	}
}
