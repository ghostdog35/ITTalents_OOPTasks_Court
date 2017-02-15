package Citizens;

import java.util.ArrayList;

import Jurists.Lawer;

public class Defendant extends Citizen{
	
	ArrayList<Lawer> lawers;
	
	public Defendant(String firstName, String middleName, String lastName, String addres, int age) {
		super(firstName, middleName, lastName, addres, age, CaseRole.DEFENDANT);
		this.lawers = new ArrayList();
	}
	
	
	public int getLawers(){
		return this.lawers.size();
	}
	
	public void addLawer(Lawer l){
		if(l!=null && !this.lawers.contains(l)){
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
		if(this.lawers.size()!=0 && temp1!=null){
			return this.lawers.contains(temp1);
		}
		return false;
	}


	public void compareLawers(Accuser ac) {
		if(this.lawers.size()!=0){
			for (Lawer lawer : lawers) {
				ac.removeLawer(lawer);
			}
		}
		
	}
	
	public void askquestionsTo(Witnes wit) {
		for (Lawer law : lawers) {
			System.out.println(law.getName() + " asks questions:");
			System.out.println("Question 1 to witnes "+wit.getName()+"......");
			System.out.println("Question 2 to witnes "+wit.getName()+"......");
			System.out.println("Question 3 to witnes "+wit.getName()+"......");
			System.out.println("Question 4 to witnes "+wit.getName()+"......");
			System.out.println("Question 5 to witnes "+wit.getName()+"......");		
		}
	}

	public void increaseCases() {
		for (Lawer lawer : lawers) {
			lawer.increaseCases();
		}
		
	}

	

}
