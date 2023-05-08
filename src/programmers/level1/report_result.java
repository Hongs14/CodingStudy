package programmers.level1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class report_result {

	public static void main(String[] args) {
		String[] id_list= {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k=2;
		int[] answer = {};
		
		//신고당한 자는 신고한 자의 ID HashSet을 갖는다.
		Map<String, HashSet<String>> reportedIds = new HashMap<>();
		//신고한 자의 '처리 결과 메일 수신 카운트 배열'을 만든다.
		int[] processMailCount = new int[id_list.length];
		
		//신고한 자의 id와 '처리 결과 메일 수신 카운트 배열' 인덱스 맵을 만든다.
		Map<String, Integer> idIndexMap = new HashMap<>();
		for(int i=0; i<id_list.length;i++) {
			idIndexMap.put(id_list[i], i);
		}
		
		//report의 원소는 "이용자id 신고한id" 형태의 문자열이다.
		for(int i=0;i<report.length; i++) {
			String[] temp = report[i].split(" ");
			if(reportedIds.get(temp[1]) == null) {
				reportedIds.put(temp[1], new HashSet<String>());
			}
			HashSet<String> set = reportedIds.get(temp[1]);
			set.add(temp[0]);
			reportedIds.put(temp[1], set);
		}
		
		//해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송한다.
		for(int i=0; i<id_list.length; i++) {
			Set<String> reporterIDS = reportedIds.get(id_list[i]);
			if(reporterIDS != null && reporterIDS.size() >= k) {
				Iterator<String> it = reporterIDS.iterator();
				while(it.hasNext()) {
					String reporter = it.next();
					processMailCount[idIndexMap.get(reporter)]++;
				}
			}
		}
		
		answer = processMailCount;
		
		for(int a:answer) {
			System.out.print(a);
		}
		
	}

}
