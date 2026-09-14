package fr.visiplus.invalidsrp;

public class Employee {
	
	private int daysPerWeek = 5;
	private int hoursPerDay = 7;
	private int workedHoursPerDay = 8;
	
	private int calculateHoursPerWeek() {
		return daysPerWeek * workedHoursPerDay;
	}
	
	public int provideToEmployee() {
		return calculateHoursPerWeek();
	}
	
	public int provideToHR() {
		return calculateHoursPerWeek();
	}

}
