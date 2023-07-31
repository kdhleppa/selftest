package selfTest.kh.basic;

public class YearningScore {
	
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];
        int count = 0;
        int sum = 0;
        
        
        for (int i = 0; i < photo.length; i++) {
        	for (int j = 0; j < photo[i].length; j++) {
        		for (int k = 0; k < name.length; k++) {
        			if (photo[i][j].equals(name[k])) { 
        				sum += yearning[k];
                	
        			}
        			answer[i] += sum;
        			sum = 0;
        		}
            }
        	}
        /*
        for (int i = 0; i < photo[0].length; i++) {
        	for (int j = 0; j < name.length; j++) {
        		if (photo[0][i].equals(name[j])) {
        			answer[0] += yearning[j];
        			}
        			
        		
        	}
        }
        */
        
        
          
        
        return answer;
    }

}
