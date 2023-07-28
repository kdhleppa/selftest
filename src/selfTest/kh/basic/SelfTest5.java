package selfTest.kh.basic;

import java.util.Arrays;

public class SelfTest5 {

		
		    public String SelfTest5(String my_string, String overwrite_string, int s) {
		        String answer = "";
		        char c;

		        char[] arr = my_string.toCharArray();

		        for (int i = 0; i < overwrite_string.length(); i++) {
		        	arr[i+s] = overwrite_string.charAt(i);
		        }
		        
		        for (int i = 0; i < arr.length; i++) {
		        c = arr[i];
		        answer += c;
		        }
		        
		        
		        
		        
		        
		        return answer;
		    }

	}

