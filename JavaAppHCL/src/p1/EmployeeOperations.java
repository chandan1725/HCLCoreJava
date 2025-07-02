package p1;

import java.util.ArrayList;
import java.util.List;

public class EmployeeOperations {
	
	List<Employee> allEmployees = new ArrayList<>();
	
	public void insertEmployee(Employee e)
	{
		allEmployees.add(e);
	}
	
	public List<Employee> getEmployeeBasedOnSalaryRange(int range1,int range2)
	{
		List<Employee> tempList = new ArrayList<>();
		
		for (Employee employee : allEmployees) {
			int empSalary = employee.getSalary();
			if(empSalary>=range1 && empSalary <= range2)
			{
				tempList.add(employee);
			}
		}
		return tempList;
	}
	
	public Employee getEmployeeById(int searchId)
	{
		for (Employee employee : allEmployees) {
			if(employee.getId() == searchId)
			{
				return employee;
			}
		}
		return null;
	}

	public List<Employee> getAllEmployees() {
		return allEmployees;
	}


	
	

}
