package fr.visiplus.invalidsrp;

public class Employee {
	
	private int daysPerWeek = 5;
	private int hoursPerDay = 7;
	private int workedHoursPerDay = 8; // this a new needed information
	
	private int calculateHoursPerWeek() {
		return daysPerWeek * workedHoursPerDay; // process
	}
	
	public int provideToEmployee() {
		System.out.prinln("Hello employee");
		return calculateHoursPerWeek();
	}
	
	public int provideToHR() {
		return calculateHoursPerWeek();
	}

}
