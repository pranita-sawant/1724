package pojo;

public class Refree {
	private String name="Lloyd Dias";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	private int age;
	private int experience;
	
	public void updates(){
		System.out.println("Updates");
	}
	
}
