package Jurists;

import Jurists.Jurist.PostType;

public class Lawer extends Jurist{

	public Lawer(String name, int yearsInternship, int countOfCases) {
		super(name, PostType.LAWER, yearsInternship, countOfCases);
	}

}