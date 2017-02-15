package Jurists;

import Jurists.Jurist.PostType;

public class Juryman extends Jurist{

	public Juryman(String name,  int yearsInternship, int countOfCases) {
		super(name, PostType.JURYMAN, yearsInternship, countOfCases);
	}

}