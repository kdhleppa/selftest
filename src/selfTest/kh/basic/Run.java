package selfTest.kh.basic;

public class Run {

	public static void main(String[] args) {

		
		YearningScore ys = new YearningScore();
		String[] name = {"mike" , "tom", "ace"};
		int[] yearning = {5,10,15};
		String[][] photo = {{"mike","alice", "tom", "kim"} , {null,null,null,null}};
		System.out.println(ys.solution(name, yearning, photo));
		
		
	}

	
}