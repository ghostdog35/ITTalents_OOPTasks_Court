package Jurists;

import Citizens.Defendant;
import Citizens.IAccusers;
import Citizens.Witnes;
import Jurists.Jurist.PostType;

public class Prosecutor extends Jurist implements IAccusers{

	public Prosecutor(String name, int yearsInternship, int countOfCases) {
		super(name, PostType.PROSECUTOR, yearsInternship, countOfCases);
	}
	
	public void askquestionsTo(Defendant def) {
		System.out.println(this.getName() + " asks questions:");
		System.out.println("Question 1 to defendant "+def.getName()+"......");
		System.out.println("Question 2 to defendant "+def.getName()+"......");
		System.out.println("Question 3 to defendant "+def.getName()+"......");
		System.out.println("Question 4 to defendant "+def.getName()+"......");
		System.out.println("Question 5 to defendant "+def.getName()+"......");
				
	}

	public void askquestionsTo(Witnes wit) {
		System.out.println(this.getName() + " asks questions:");
		System.out.println("Question 1 to witnes "+wit.getName()+"......");
		System.out.println("Question 2 to witnes "+wit.getName()+"......");
		System.out.println("Question 3 to witnes "+wit.getName()+"......");
		System.out.println("Question 4 to witnes "+wit.getName()+"......");
		System.out.println("Question 5 to witnes "+wit.getName()+"......");	
	}

}
