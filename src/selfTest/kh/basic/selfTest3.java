package selfTest.kh.basic;

import java.util.Scanner;

public class selfTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i = 0; i < 5; i++){
			
			char ch = str.charAt(i);
			System.out.println(ch);
		}
    }
	
	
}
