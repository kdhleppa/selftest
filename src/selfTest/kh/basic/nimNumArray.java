package selfTest.kh.basic;

import java.util.ArrayList;
import java.util.List;

public class nimNumArray {
	
	public int solution(String t, String p) {
        
		/*
		int answer = 0;
        int count = 0;
        int num = 0;
        
        char[] arr = new char[t.length()];
        int[] arr3 = new int[t.length()];
        // List<Integer> arr2 = new ArrayList<>();
        int[] arr2 = new int[(arr3.length)-(p.length()) +1];
        // 1. p.length 만큼 t 0~2 1~3 2~4 씩 자르기 
        // 1-2 charAt 으로 쪼개서 배열에 입력 ex) 3141592 = {3,1,4,1,5,9,2}
        // 1-3 3*10^p.length-1 + 1*10^p.length-2 + 4*10^p.length-3 
        // 2. 크기 비교후 count++으로 result구하기
        for (int i = 0 ; i < t.length(); i++) {
            arr[i] = t.charAt(i);
        }
        for (int i = 0; i < arr.length; i++) {
        	arr3[i] = arr[i]-'0';
        }
        
        for (int i = 0; i < (arr3.length)-(p.length()) +1 ; i++){ // 위 예시 7- 3 = 4까지감 0 1 2 3 인덱스
        	int sum = 0;
        	for (int j = 0; j < p.length(); j++) {
            	double k = p.length()-1-j;
                num = (int) (arr3[i+j] * ( Math.pow (10, k) ) );
                sum += num;
                
            } arr2[i]=sum;
            
        }
        for (int i = 0 ; i < arr2.length; i++) {
        	if (arr2[i] <= Integer.parseInt(p)) {
        		
        		count++;
        	}
        }
        answer = count;
        
        */
        return answer;
    }

}
