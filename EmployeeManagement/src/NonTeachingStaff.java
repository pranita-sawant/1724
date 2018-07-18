
public class NonTeachingStaff extends Staff{
	private Integer numberOfNonTeachingLeaves;
	
	public NonTeachingStaff() {
		super();
		numberOfNonTeachingLeaves = 0;
	}

	public NonTeachingStaff(Integer numberOfNonTeachingLeaves) {
		super();
		this.numberOfNonTeachingLeaves = numberOfNonTeachingLeaves;
	}

	public Integer getNumberOfNonTeachingLeaves() {
		return numberOfNonTeachingLeaves;
	}

	public void setNumberOfNonTeachingLeaves(Integer numberOfNonTeachingLeaves) {
		this.numberOfNonTeachingLeaves = numberOfNonTeachingLeaves;
	}

	@Override
	public void calculateSalary() {
		System.out.println("Non-Teaching Staff : Method calculateSalary()");		
	}

}
