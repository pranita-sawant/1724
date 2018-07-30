
public class ContractTeacher extends Staff implements Pay {

	@Override
	public void calculateSalary() {
		System.out.println("Contract Base Teacher");
	}
	
	public void calculatePay(){
		System.out.println("calculating contract teacher pay");
	}

}
