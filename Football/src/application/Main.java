package application;

import pojo.Ball;
import pojo.Defender;
import pojo.Ground;
import pojo.Player;
import pojo.Refree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-------------------------------------------------------------");
		Player captain=new Player();
		captain.setAge(21);
		captain.setName("Lloyd Dias");
		
		Player goalkeeper=new Player("Pranita Sawant",22);
		System.out.println("Caption name="+captain.getName());
		System.out.println("Team_Leader="+goalkeeper.getName()+" \n"+"Age="+goalkeeper.getAge());
		System.out.println(" ");
		
		System.out.println("------------------------------------------------------------");
		Defender df= new Defender();
		System.out.print("Method from Player :"); 
		df.kick();   //method from Player
		df.calculateSalary(); //abstract method from Salary
		df.bonus(); //abstract method from Salary
		df.totalMatchesPlayed();  //abstract method from TotalMatches
	}

}
