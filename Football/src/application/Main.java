package application;

import pojo.Ball;
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
		System.out.println("Team Leader="+goalkeeper.getName()+"  "+"Age="+goalkeeper.getAge());
		
	}

}