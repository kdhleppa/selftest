package selfTest.kh.basic;

public class nimNumArray {
	
	public int solution(String t, String p) {
        int answer = 0;
        int conunt = 0;
        int sum = 0;
        int[] arr = new int[t.length()];
        // 1. p.length 만큼 t 0~2 1~3 2~4 씩 자르기 
        // 1-2 charAt 으로 쪼개서 배열에 입력 ex) 3141592 = {3,1,4,1,5,9,2}
        // 1-3 3*10^p.length-1 + 1*10^p.length-2 + 4*10^p.length-3 
        // 2. 크기 비교후 count++으로 result구하기
        for (int i = 0 ; i < t.length(); i++) {
            arr[i] = p.charAt(i);
            
        }
        for (int i = 0; i < arr.length-p.length(); i++){
            for (int j = 0; j < p.length(); j++) {
                sum = (arr[i]*(10^(p.length()-1-j)));
                i++;
                sum += sum;
            }
            
        }
        
        
        
        return answer;
    }

}
