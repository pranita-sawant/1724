
public class App {
	public static void main(String args[]){
		//Staff staff1 = new Staff();
		TeachingStaff staff2 = new TeachingStaff();
		Staff staff3 = new TeachingStaff();
		Staff staff4 =new NonTeachingStaff();
		
		staff2.calculateTeachingHours();
		System.out.println("Teaching Staff Class:");
		staff3.calculateSalary();
		staff4.calculateSalary();
		System.out.println(" ");
		
		ContractTeacher contract=new ContractTeacher();
		System.out.println("Contractor Class:");
		contract.calculatePay();
		contract.calculateSalary();
	}
}
