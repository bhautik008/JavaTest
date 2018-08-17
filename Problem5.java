package test1;

public class Problem5 {
	
	public static void main(String[] args) {
		String[] setAnswers = {"a","a","b","b"};
		String[] stdAnswers = {"a","c","b","c"};
		int score = scoreUp(setAnswers,stdAnswers);
		System.out.println("Student scored: "+score);
	}

	private static int scoreUp(String[] setAnswers, String[] stdAnswers) {
		int score = 0;
		for(int i=0;i<setAnswers.length;i++) {
			if(stdAnswers[i].equals(setAnswers[i])) {
				score += 4;
			} else if(stdAnswers[i].equals("?")) {
				continue;
			} else {
				score -= 1;
			}
		}
		return score;
	}
}