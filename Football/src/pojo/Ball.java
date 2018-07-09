package pojo;

public class Ball {
	private int size;
	
	public Ball(){
		size=0;
	}
	
	public Ball(int size){
		this.size=size;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	private int weight;
	private String color;
	
	public void getBallSize(){
		System.out.println("Ball Size");
		
	}
	
	public void getBallWeight(){
		System.out.println("Size Weight");
	}
}
