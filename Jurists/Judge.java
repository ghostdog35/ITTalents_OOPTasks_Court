package Jurists;

import Jurists.Jurist.PostType;

public class Judge  extends Jurist{

	public Judge(String name, int yearsInternship, int countOfCases) {
		super(name, PostType.JUDGE, yearsInternship, countOfCases);
	}

}
