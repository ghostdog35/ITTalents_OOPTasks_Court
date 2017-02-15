package Citizens;

public abstract class Citizen {
	
	enum CaseRole{ DEFENDANT, ACCUSER, WITNESS }
	
	protected String firstName;
	protected String middleName;
	protected String lastName;
	private String addres;
	private int age;
	private CaseRole role;
	
	public Citizen(String firstName, String middleName, String lastName, String addres, int age, CaseRole role) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.addres = addres;
		this.age = age;
		this.role = role;
	}
	
	public String getName(){
		return this.firstName+" "+this.lastName;
	}

	@Override
	public String toString() {
		return "Citizen [" + firstName + " " + middleName + " " + lastName + ", addres="
				+ addres + ", age= " + age + "-" + role + "]";
	}
	
	
	
	
	
	

}
