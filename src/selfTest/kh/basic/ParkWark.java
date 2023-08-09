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
		
		int[] SP = {0,0};// 좌표값 초기화

		Set<Character> XP = new HashSet<>(Arrays.asList('X', 'S'));
		
		for (String row : park) {
			for (char c : row.toCharArray()) {
				XP.add(c);
			}
		}
		
		for (int row = 0; row < H; row++) {
			for (int col = 0; col < W; col++) {
				if(park[row].charAt(col) == 'S') {
					SP[0] = row;
					SP[1] = col;
					break;
				}
			}
		}
		
		for (String route: routes) {
			String[] parts = route.split(" ");
			char vector = parts[0].charAt(0);
			int distance = Integer.parseInt(parts[1]);
			
			int newRow = SP[0];
			int newCol = SP[1];
			
			
			if (vector == 'N') {
				newRow -= distance;
			} else if (vector == 'S') {
				newRow += distance;
			} else if (vector == 'W') {
				newCol -= distance;
			} else if (vector == 'E') {
				newCol += distance;
			}
			if ( newRow >= 0 && newRow < H && newCol >= 0 && newCol < W) {
				SP[0] = newRow;
				SP[1] = newCol;
			}
		}
		
		// return SP;
		System.out.println(SP[0]+SP[1]);
		System.out.println(SP[1]);
	}

	
}
