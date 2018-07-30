package pojo;

public class Defender extends Player implements Salary,TotalMaches {  //Two implement classes in one class 

	@Override
	public void calculateSalary() {
		System.out.println("Calculate Salary For Defender");
	}

	@Override
	public void totalMatchesPlayed() {
		System.out.println("Total Matches Played by Defender");
	}

	@Override
	public void bonus() {
		System.out.println("Calculate Bonus for Defender");	
	}

}
