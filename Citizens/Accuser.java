package Citizens;

import java.util.ArrayList;

import Citizens.Citizen.CaseRole;
import Jurists.Lawer;

public class Accuser extends Citizen implements IAccusers{
	
	ArrayList<Lawer> lawers;
	
	public Accuser(String firstName, String middleName, String lastName, String addres, int age) {
		super(firstName, middleName, lastName, addres, age, CaseRole.ACCUSER);
		this.lawers = new ArrayList();
	}
	
	public void increaseCases() {
		for (Lawer lawer : lawers) {
			lawer.increaseCases();
		}
		
	}

	public int getLawers(){
		return this.lawers.size();
	}
	
	public void addLawer(Lawer l){
		if(l!=null){
			this.lawers.add(l);
			return;
		}
	}
	public void removeLawer(Lawer l){
		if(this.lawers.contains(l)){
			this.lawers.remove(l);
		}
	}
	public boolean contains(Lawer temp1) {
		
		return this.lawers.contains(temp1);
	}

	public void askquestionsTo(Defendant def) {
		for (Lawer law : lawers) {
			System.out.println(law.getName() + " asks questions:");
			System.out.println("Question 1 to defendant "+def.getName()+"......");
			System.out.println("Question 2 to defendant "+def.getName()+"......");
			System.out.println("Question 3 to defendant "+def.getName()+"......");
		}		
	}

	public void askquestionsTo(Witnes wit) {
		for (Lawer law : lawers) {
			System.out.println(law.getName() + " asks questions:");
			System.out.println("Question 1 to witnes "+wit.getName()+"......");
			System.out.println("Question 2 to witnes "+wit.getName()+"......");
			
		}
		
	}
	
	

}
