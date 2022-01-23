
public class Employee extends Person{
	int salary;
	
	public Employee(int id, int salary) {
		super(id);
		this.salary=salary;
	}
	
	@Override
	public boolean greaterThan(GreaterThan obj) {
		if(salary > ((Employee)obj).salary) {
			return true;
		}		
		return false;
	}
	
}
