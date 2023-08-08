package selfTest.kh.basic;

import java.util.HashMap;
import java.util.Map;

public class ParkWark {
	public static void main(String[] args) {
		
		String[] park = {"OSO", "OOO", "OXO", "OOO"};
		String[] routes = {"E 2", "S 3", "W 1"};
		
		// park 를 맵으로 구성?
		// park 를 2차원 배열로 만들어서 o s o/o o o/ o x o/ o o o로 구성(맵구성완료)
		Map<Integer, Map<Integer, Character>> map = new HashMap<>();
		
		// 현재위치를 계속 저장해주는 함수 StartPoint 생성해서 저장해줌
		int[] SP = new int[2];// 좌표
		// 방향중 ns는 index값 0에 영향을주고 we는 1에 영향을 줌
		
		for (int i = 0; i < park.length; i++) {
			
			Map<Integer, Character> inMap = new HashMap<>();
			
			for (int j = 0; j < park[i].length(); j++) {
				inMap.put(j, park[i].charAt(j));
				
			}
			map.put(i, inMap);
		}
				
		// park[i] 의 length = W-1 가로길이
		// park[i] 의 i = H-1 세로길이
		
		
		
		// for문으로 검색하다가 parkmap[i][j] o 나 s 나 x를 만났을때 행동만들기
		// for i ~ j, if (map.get(i).get(j) == 's') { startpoint[] = {i, j} }

		
		
		// for i ~ j, if (startpoint[] + routes = map.get(i).get(j) == 'x') { break;
		/* 여기부터 다시 생각 */
		
		
		// for i ~ j, if (map.get(i).get(j) == 'o') {
		
		// StartPoint 의 초기값은 s를 만나는곳, routes 의 e, n방향은 +
		// s, w방향은 -값을 += 으로 더해줌 더해준값이 startpoint = {i, j}라면
		// if parkmap[i][j]값이 x일때 or i,j값이 h-1, w-2 보다 크다면 break;
		// map 을 사용한다면 Map<Integer, Map<Integer, Charater> map = new Map<>(); 사용해줘야함
		// (sp += routes) != parkmap[i][j] 가 아닐때만 더해주는것도 이상함.
		// routes[0] 의 charAt(0)이고 chartAt(2)라면
		// charAt(0) 이 E일때는 sp[0] + charAt(2)
		// charAt(0) 이 W일때는 sp[0] - charAt(2)
		// charAt(0) 이 S일때는 sp[1] - charAt(2)
		// charAt(0) 이 N일때는 sp[1] + charAt(2)
		
		
	}

}
