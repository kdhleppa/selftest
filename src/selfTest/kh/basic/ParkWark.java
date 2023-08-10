package selfTest.kh.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ParkWark {
	public static void main(String[] args) {
		
		String[] park = {"OSO", "OOO", "OXO", "OOO"};
		String[] routes = {"E 2", "S 3", "W 1"};
		
		int H = park.length; 
		int W = park[0].length();
		char[][] XP = null;

		for (int i = 0; i< H; i++){
			for (int j = 0; j< park[i].length(); j++) {
				XP = new char[park.length][park[i].length()];
				XP[i][j] = park[i].charAt(j);
			}
        }
		
		int[] answer = {0,0};// 좌표값 초기화
		
			
		for (int row = 0; row < H; row++) {
			for (int col = 0; col < W; col++) {
				if(XP[row][col] == 'S') {
					answer[0] = row;
					answer[1] = col;
					break;
				}
			}
		}
		
		for (String route: routes) {
			String[] parts = route.split(" ");
			char vector = parts[0].charAt(0);
			int distance = Integer.parseInt(parts[1]);
					
			int newRow = answer[0];
			int newCol = answer[1];
			
			
			
			if (vector == 'N') {
				newRow -= distance;
			} else if (vector == 'S') {
				newRow += distance;
			} else if (vector == 'W') {
				newCol -= distance;
			} else if (vector == 'E') {
				newCol += distance;
			}
			
			
			if ( newRow >= 0 && newRow < H && newCol >= 0 && newCol < W 
					 && XP[newRow][newCol] !='X') {
				answer[0] = newRow;
				answer[1] = newCol;
			} else {
				break;
			}
			
		
		
		
		}
		
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		
	}

	
}
