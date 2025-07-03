package p1;

public class MainClass {

	public static void main(String[] args) {
		
		
		int x = 100;
		Employee e = new Employee();
		System.out.println(e.getEmpId());
		System.out.println(e.getName());
		System.out.println(e);
		System.out.println(x); // 100
		
		Employee e2 = new Employee(101, "Amit Kumar", 2000);
		System.out.println(e2);
		
		// ------ Change Salary ----
		
		int employeeSalary = e2.getSalary();
		int newSalary = (int) (employeeSalary*1.10);
		e2.setSalary(newSalary);
		
		System.out.println("Updated Record");
		System.out.println(e2);
		
		
		
		
	}
}
