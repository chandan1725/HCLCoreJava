package p1;

import java.util.List;
import java.util.Scanner;

public class MainApp {

	Scanner  sc  = new Scanner(System.in);
	Scanner  scStr  = new Scanner(System.in);
	
	EmployeeOperations empOps = new EmployeeOperations();
	
	public static void main(String[] args) {
		MainApp app = new MainApp();
		while(true)
		{
				System.out.println("1. Add Employee");
				System.out.println("2. Find Employee");
				System.out.println("3. Display All");
				System.out.println("4. Find Employees Based On Salary");
				
				System.out.println("0 EXIT");
				
				System.out.println("Enter Ur Choice : - ");
				switch (app.sc.nextInt()) {
				case 1: 
						app.addEmployee();
						break;
				case 2: app.getEmployeeById();
						break;
				case 3: app.getAllEmployee();break;
				case 4: app.getEmployeeBySalary();break;
				
				case 0 : System.exit(0);
				}// end switch
				
				
		}//end while
		
	}//end main
	
	public void getEmployeeBySalary()
	{
		System.out.println("Enter Salary1 : ");
		int salary1 = sc.nextInt();
		
		System.out.println("Enter Salary2 : ");
		int salary2 = sc.nextInt();
		
		List<Employee> resultList = empOps.getEmployeeBasedOnSalaryRange(salary1, salary2);
		for (Employee e : resultList) {
			display(e);
		}
		
	}
	public void addEmployee()
	{
		System.out.println("Enter Id : ");
		int id = sc.nextInt();
		
		System.out.println("Enter Name : ");
		String name = scStr.nextLine();
		System.out.println("Enter Salary : ");
		int salary = sc.nextInt();
		
		
		
		Employee e = new Employee(id, name, salary);
		empOps.insertEmployee(e);
		
	}
	public void getEmployeeById()
	{
		System.out.println("Enter Id To Search : ");
		int id = sc.nextInt();
		Employee e = empOps.getEmployeeById(id);
		
		display(e);
	}
	public void getAllEmployee()
	{
		for (Employee e : empOps.getAllEmployees()) {
			display(e);
		}
	}
	
	public void display(Employee e)
	{
		System.out.println(e.getId()+" "+e.getEmpName()+" "+e.getSalary());
	}
	
	
}//end class
