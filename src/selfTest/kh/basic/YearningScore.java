package selfTest.kh.basic;

public class YearningScore {
	
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};
        int count = 0;
        
        
        //1. 포토배열과 네임배열에서 겹치는 값이 있을때
        //2. count++ 해주고
        //3. 네임배열인덱스 순서에 맞는 이여닝 인덱스순서값을 answer에 순차적대입
        
        for (int i = 0; i < photo[0].length; i++) { // i값이 0 , 1, 2, 3순차로 들어감
        	for (int j = 0; j < name.length; j++) { // name 인덱스값 j를 순차적으로 돌림
                if (photo[0][i].equals(name[j])) { //포토 0행 0 값 mike값이 name 0 mike 값과 같을때
                	count++;
                	
                	}
                }
        	}
        
        for (int i = 0; i < photo[0].length; i++) {
        	for (int j = 0; j < name.length; j++) {
        		if (photo[0][i].equals(name[j])) {
        			for (int k = 0; k < count; k++ ) {
        			answer[k] = yearning[j];
        			}
        			
        		}
        	}
        }
        
        
          
        
        return answer;
    }

}
