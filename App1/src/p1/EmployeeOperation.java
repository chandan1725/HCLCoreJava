package p1;

public class EmployeeOperation {

	public Employee changeSalary(Employee e, int per)
	{
		int currentSalary = e.getSalary();
		int hikeAmount = (int)((currentSalary*per)/100);
		e.setSalary(currentSalary+hikeAmount);
		
		return e;
	}
}
