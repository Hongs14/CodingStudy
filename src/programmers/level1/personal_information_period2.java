package programmers.level1;

import java.util.ArrayList;
import java.util.HashMap;

public class personal_information_period2 {

	public static void main(String[] args) {
		String today = "2020.01.01";
		String[] terms = {"Z 3", "D 5"};
		String[] privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
		int[] answer ={};
		ArrayList<Integer> list = new ArrayList<>();
		
		String[] term = new String[terms.length*2];
		HashMap<Integer, String[]> privacies_map = new HashMap<>();
		
		for(int i=0; i<terms.length; i++) {
			String[] temp = {};
			temp = terms[i].split(" ");
			term[2*i] = temp[0];
			term[2*i+1] = temp[1];
		}
		
		for(int i=0; i<privacies.length; i++) {
			String[] temp = {};
			temp = privacies[i].split(" ");
			privacies_map.put(i+1, temp);
		}
		
		for(Integer key : privacies_map.keySet()) {
			for(int j=0;j<term.length;j++) {
				if(privacies_map.get(key)[1].equals(term[j])) {
					String[] temp1 = new String[2];
					temp1[0] = privacies_map.get(key)[0];
					temp1[1] = term[j+1];
					privacies_map.replace(key, temp1);
			        break;
			    }
			}
		}
		
		for(Integer key : privacies_map.keySet()) {		
			String[] day = privacies_map.get(key)[0].split("\\.");
			if(Integer.parseInt(day[2]) == 1) {
				day[2] = ""+0;
			}
			int collect_s_date = (Integer.parseInt(day[1])-1)*28+1 + Integer.parseInt(day[2]);
			int collect_e_date = collect_s_date + (Integer.parseInt(privacies_map.get(key)[1])*28-1);
			
			if(collect_e_date > 336) {
				int year = Integer.parseInt(day[0])+1;
				day[0] = ""+year;
				collect_e_date -= 337;
			}
			
			String[] compare_day = today.split("\\.");
			if(Integer.parseInt(compare_day[2]) == 1) {
				compare_day[2] = ""+0;
			}
			int compare_day_num = (Integer.parseInt(compare_day[1])-1)*28+1 + Integer.parseInt((compare_day[2]));
			System.out.println("key: "+key+", day[0]: "+day[0]+",compare_day: "+compare_day[0]+", collect_e_date: "+collect_e_date+", compare_day_num: "+compare_day_num);
			if(Integer.parseInt(compare_day[0]) > Integer.parseInt(day[0]) || Integer.parseInt(compare_day[0]) == Integer.parseInt(day[0]) && collect_e_date < compare_day_num) {
				list.add(key);
			}
		}
		answer = new int[list.size()];
		for(int k=0;k<list.size();k++) {
			answer[k] = list.get(k);
		}
		for(int as:answer) {
			System.out.println(as);
		}
		
	}

}
