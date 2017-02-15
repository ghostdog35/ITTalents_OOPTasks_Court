package Demo;

import Citizens.Accuser;
import Citizens.Citizen;
import Citizens.Defendant;
import Citizens.Witnes;
import Court.Case;
import Court.Case.CaseType;
import Court.Court;
import Jurists.Judge;
import Jurists.Jurist;
import Jurists.Juryman;
import Jurists.Lawer;
import Jurists.Prosecutor;

public class Demo {
	
	public static void main(String[] args) {
		
	
		Court court = new Court("Raionen syd", "Veliko Tyrnovo");
		Jurist judge1 = new Judge("Ivan Ivanov", 8, 15);
		Jurist judge2 = new Judge("Petyr Petrov", 9, 25);
		Jurist judge3 = new Judge("Stoqn Stoqnov", 10, 65);
		court.addJurist(judge1);
		court.addJurist(judge2);
		court.addJurist(judge3);
		Jurist jury1 = new Juryman("Ivan Ivanov", 8, 0);
		Jurist jury2 = new Juryman("Ivan Stoqnov", 1, 0);
		Jurist jury3 = new Juryman("Pesho Ivanov", 2, 0);
		Jurist jury4 = new Juryman("Gosho Ivanov", 3, 0);
		Jurist jury5 = new Juryman("Sasho Ivanov", 4, 1);
		Jurist jury6 = new Juryman("Pacho Ivanov", 18, 10);
		Jurist jury7 = new Juryman("Gosho Stoqnov", 8, 5);
		Jurist jury8 = new Juryman("Ivan Peshev", 7, 14);
		Jurist jury9 = new Juryman("Ivan Kostov", 8, 18);
		Jurist jury10 = new Juryman("Ivan Tikvov", 9, 19);
		court.addJurist(jury1);
		court.addJurist(jury2);
		court.addJurist(jury3);
		court.addJurist(jury4);
		court.addJurist(jury5);
		court.addJurist(jury6);
		court.addJurist(jury7);
		court.addJurist(jury8);
		court.addJurist(jury9);
		court.addJurist(jury10);
		
		Jurist lawer1 = new Lawer("Ivan Ivanov", 8, 18);
		Jurist lawer2 = new Lawer("Ivan Stoqnov", 9, 15);
		Jurist lawer3 = new Lawer("Pesho Ivanov", 10, 14);
		Jurist lawer4 = new Lawer("Pacho Ivanov",12, 25);
		Jurist lawer5 = new Lawer("Ivan Tikvov", 8, 38);
		court.addJurist(lawer1);
		court.addJurist(lawer2);
		court.addJurist(lawer3);
		court.addJurist(lawer4);
		court.addJurist(lawer5);
		
		Jurist prosek1 = new Prosecutor("Ivan Ivanov", 12, 18);
		Jurist prosek2 = new Prosecutor("Ivan Stoqnov", 18, 26);
		court.addJurist(prosek1);
		court.addJurist(prosek2);
		court.showInfo();
		
		Citizen def1 = new Defendant("Ivan", "Ivanov", "Tikvov", "Sofiq", 25);
		Citizen def2 = new Defendant("Pacho", "Stoqnov", "Tikvov", "Sofiq", 25);
		Citizen def3 = new Defendant("Gosho", "Tikvov", "Ivanov", "Sofiq", 25);
		Citizen def4 = new Defendant("Pacho", "Stoqnov", "Ivanov", "Sofiq", 25);
		Citizen def5 = new Defendant("Gosho", "Tikvov", "Stoqnov", "Sofiq", 25);
		
		Citizen acc1 = new Accuser("Gosho", "Ivanov", "Ivanov", "Sofiq", 25);
		Citizen acc2 = new Accuser("Ivan", "Stoqnov", "Ivanov", "Sofiq", 25);
		Citizen acc3 = new Accuser("Pacho", "Tikvov", "Stoqnov", "Sofiq", 25);
		Citizen acc4 = new Accuser("Gosho", "Stoqnov", "Ivanov", "Sofiq", 25);
		Citizen acc5 = new Accuser("Pacho", "Ivanov", "Stoqnov", "Sofiq", 25);
		
		Citizen wit1 = new Witnes("Gosho", "Ivanov", "Ivanov", "Sofiq", 25);
		Citizen wit2 = new Witnes("Ivan", "Stoqnov", "Ivanov", "Sofiq", 25);
		Citizen wit3 = new Witnes("Pacho", "Tikvov", "Stoqnov", "Sofiq", 25);
		Citizen wit4 = new Witnes("Gosho", "Stoqnov", "Ivanov", "Sofiq", 25);
		Citizen wit5 = new Witnes("Pacho", "Ivanov", "Stoqnov", "Sofiq", 25);
		
		Case civil1 = new Case(court, CaseType.CIVIL, (Defendant) def1, acc1);
		civil1.addWitnes(wit1);
		civil1.addWitnes(wit2);
		civil1.addWitnes(wit3);
		civil1.conductCase();
	
	
	}

}
