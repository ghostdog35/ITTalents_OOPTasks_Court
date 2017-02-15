package Court;

import java.util.HashSet;
import java.util.Random;

import Citizens.Accuser;
import Citizens.Citizen;
import Citizens.Defendant;
import Citizens.IAccusers;
import Citizens.Witnes;
import Jurists.Judge;
import Jurists.Juryman;
import Jurists.Lawer;
import Jurists.Prosecutor;

public class Case {
	public enum CaseType{ CIVIL, CRIMINAL}
	protected Court court;
	protected CaseType type;
	protected Judge judge;
	protected HashSet<Juryman> jury;
	protected Defendant defendant;
	protected IAccusers accuser;
	protected HashSet<Witnes> witneses;
	protected final int max_count_of_jury;
	
	
	
	public Case(Court court, Defendant defendant, Prosecutor prosecutor) {
		this.court=court;
		this.type = type;
		this.judge = this.court.getRandomJudge();;
		this.defendant = defendant;
		this.accuser = prosecutor;
		if(type==CaseType.CRIMINAL){
			this.max_count_of_jury=13;
		}
		else{
			this.max_count_of_jury=3;
		}
		this.jury = new HashSet();
		this.witneses= new HashSet();
		this.court.addJury(this);
		this.addLawers();
	}
	public Case(Court court, CaseType type, Defendant defendant, Citizen accuser) {
		this.court=court;
		this.type = type;
		this.judge = this.court.getRandomJudge();;
		this.defendant = defendant;
		this.accuser = (IAccusers) accuser;
		if(type==CaseType.CRIMINAL){
			this.max_count_of_jury=13;
		}
		else{
			this.max_count_of_jury=3;
		}
		this.jury = new HashSet();
		this.witneses= new HashSet();
		this.court.addJury(this);
		this.addLawers();
	}
	
	public void addWitnes(Citizen wit1){
		if(wit1!=null){
			this.witneses.add((Witnes) wit1);
		}
	}

	private void addLawers() {
		if(this.type==CaseType.CIVIL){
			Accuser tempAcc= (Accuser) this.accuser;
			this.defendant.compareLawers(tempAcc);
			while(tempAcc.getLawers()==0){
				Lawer tempLaw = this.court.getRandomLawer();
				if(!this.defendant.contains(tempLaw)){
					tempAcc.addLawer(tempLaw);
				}
				
			}
			while(this.defendant.getLawers()==0){
				Lawer tempLaw2 = this.court.getRandomLawer();
				if(!tempAcc.contains(tempLaw2)){
					this.defendant.addLawer(tempLaw2);
				}
				
			}
			
		}
		else{
			if(this.defendant.getLawers()==0){
				Lawer tempLaw2 = this.court.getRandomLawer();
				this.defendant.addLawer(tempLaw2);
			}
		}
	}
	
	public void conductCase(){
		System.out.println("The case is opened");
		this.showInfo();
		this.judge.increaseCases();
		for (Juryman juryman : jury) {
			juryman.increaseCases();
		}
		this.defendant.increaseCases();
		if(this.type==CaseType.CIVIL){
			Accuser tempAcc= (Accuser) this.accuser;
			tempAcc.increaseCases();
			tempAcc.askquestionsTo(this.defendant);
			for (Witnes wit : witneses) {
				tempAcc.askquestionsTo(wit);
				this.defendant.askquestionsTo(wit);
			}
		}
		else{
			Prosecutor tempPro= (Prosecutor) this.accuser;
			tempPro.increaseCases();
			tempPro.askquestionsTo(this.defendant);
			for (Witnes wit : witneses) {
				tempPro.askquestionsTo(wit);
				this.defendant.askquestionsTo(wit);
			}
		}
		if(this.isGuilty()){
			System.out.println("The Jury says - Guilty");
			System.out.println("The Judge says - the defendant is sentenced to "+(new Random().nextInt(38)+3)+" years in prison!");
			System.out.println("The case is closed");
		}
		else{
			System.out.println("The Jury says - Not Guilty");
			System.out.println("The Judge says - the defendant is free to go");
			System.out.println("The case is closed");
		}

	}
	
	public boolean isGuilty(){
		int count=0;
		for (Witnes wit : witneses) {
			count+= new Random().nextInt(3)-1;
		}
		if(count == 0){
			return this.isGuilty();
		}
		else{
			return count>0;
		}
	}
	
	public void showInfo(){
		System.out.println(this.court);
		System.out.println("Case type "+this.type);
		System.out.println(this.judge);
		System.out.println(this.defendant);
		System.out.println(this.accuser);
		for (Juryman juryman : jury) {
			System.out.println(juryman);
		}
		for (Witnes wit : witneses) {
			System.out.println(wit);;
		}
	}
	
	
}

