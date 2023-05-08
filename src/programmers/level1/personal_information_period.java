package programmers.level1;

import java.util.HashMap;

public class personal_information_period {

	public static void main(String[] args) {
		String today = "2022.05.19";
		String[] terms = {"A 6", "B 12", "C 3"};
		String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		
		String[] term = new String[terms.length*2];
		HashMap<String, String> privacies_map = new HashMap<>();
		
		for(int i=0; i<terms.length; i++) {
			String[] temp = {};
			temp = terms[i].split(" ");
			term[2*i] = temp[0];
			term[2*i+1] = temp[1];
		}
		
		for(int i=0; i<privacies.length; i++) {
			String[] temp = {};
			temp = privacies[i].split(" ");
			privacies_map.put(temp[0], temp[1]);
		}
		
		for(String key:privacies_map.keySet()) {
			System.out.println(key + ": " + privacies_map.get(key));
		}
		
		
		for(String key : privacies_map.keySet()) {
			for(int j=0;j<term.length;j++) {
				if(privacies_map.get(key).equals(term[j])) {
					privacies_map.replace(key, term[j+1]);
			        break;
			    }
			}

		}
		
		
		for(String key : privacies_map.keySet()) {
			String[] day = key.split(".");
			int collect_s_date =(Integer.parseInt(day[1])-1)*28+1 + Integer.parseInt(day[2]);
			int collect_e_date = collect_s_date + (Integer.parseInt(privacies_map.get(key))*28-1);
			
			if(collect_e_date > 336) {
				day[0] += 1;
				collect_e_date -= 336;
			}
			
			String[] compare_day = today.split(".");
			int compare_day_num = (Integer.parseInt(compare_day[1])-1)*28+1 + Integer.parseInt(day[2]);
			
//			if()
			
		}
		
		
		
		
	}

}
