
public class Person implements GreaterThan {
	int id;
	
	public Person(int id) {
		this.id=id;
	}
	
	
	@Override
	public boolean greaterThan(GreaterThan obj) {
		if(id > ((Person)obj).id) {
			return true;
		}		
		return false;
	}

}
