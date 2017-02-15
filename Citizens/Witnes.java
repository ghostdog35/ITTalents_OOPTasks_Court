package Citizens;

import Citizens.Citizen.CaseRole;

public class Witnes extends Citizen{

	public Witnes(String firstName, String middleName, String lastName, String addres, int age) {
		super(firstName, middleName, lastName, addres, age, CaseRole.WITNESS);
		
	}
	

}
