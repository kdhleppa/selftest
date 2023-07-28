package selfTest.kh.basic;


import java.util.Scanner;

public class selfTest4 {

	
	public static void main(String[] args) {
		

       Scanner sc = new Scanner(System.in);
       String a = sc.next();
       
       
       int d = a.length();
       char b;
       for (int i = 0; i <= d-1; i ++) {
    	   b = a.charAt(i);
    	   if (b >= 65 && b<=90) {
    		   b = (char)(b+32);
    	   }
    	   else if (b >= 97 && b<=122) {
    		   b = (char)(b-32);
    	   }
    	   System.out.print(b);
       }
		        
	}
}	
	

