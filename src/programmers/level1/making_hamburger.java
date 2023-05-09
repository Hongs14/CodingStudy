package programmers.level1;
import java.util.ArrayList;

public class making_hamburger {
//수정해보기
	public static void main(String[] args) {
		int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
		int answer = 0;
		
		ArrayList<Integer> list = new ArrayList<>();

		for(int i:ingredient) {
			list.add(i);
		
			if(list.size() >= 4) {
				if(list.get(list.size()-4) == 1 && list.get(list.size()-3)==2 && list.get(list.size()-2)==3 && list.get(list.size()-1)==1) {
					list.remove(list.size()-1);
					list.remove(list.size()-2);
					list.remove(list.size()-3);
					list.remove(list.size()-4);
				}
			}
		}
		
		System.out.println(answer);
	}

}
