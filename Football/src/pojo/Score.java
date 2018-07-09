package pojo;

public class Score {
	private int winner;
	public int getWinner() {
		return winner;
	}
	
	public Score() {
		winner = winner;
		goal = goal;
	}
	
	public Score(int winner, int goal) {
		this.winner = winner;
		this.goal = goal;
	}


	public void setWinner(int winner) {
		this.winner = winner;
	}
	public int getGoal() {
		return goal;
	}
	public void setGoal(int goal) {
		this.goal = goal;
	}
	private int goal;
	
	public void calculateWinner(){
		System.out.println("Winner Name:");
	}
}
