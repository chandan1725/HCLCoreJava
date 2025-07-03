package p1;

import java.util.Scanner;

public class EmployeeMain {

	EmployeeOperation empOps = new EmployeeOperation();
	
	public static void main(String[] args) {
		
		EmployeeMain app = new EmployeeMain();
		
		Employee e = app.addEmployee();
		app.display(e);
		Employee e2 = app.updateSalary(e);
		app.display(e2);
	}
	
	public void display(Employee e)
	{
		System.out.println(e);
	}
	
	public Employee updateSalary(Employee e)
	{
		// get the increment per from user
		
		int per = 4;
		
		Employee updatedEmployee = empOps.changeSalary(e, per);
		
		return updatedEmployee;
	}
	
	public Employee addEmployee()
	{
		// use scanner 
		Employee e = new Employee(101, "Amit Kumar",2000);
		return e;
	}
}
