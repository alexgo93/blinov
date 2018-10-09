
public class Pet {
	public String Name;
	public int age;
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Pet) {
			if (this.Name.equals(((Pet) o).Name) && this.age == ((Pet) o).age) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
		
	// to Do
	//	override hashode
		
	}
}
