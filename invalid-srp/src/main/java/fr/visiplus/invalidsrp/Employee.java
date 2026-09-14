package fr.visiplus.invalidsrp;

public class Employee {
	
	private int daysPerWeek = 5; // nombre de jours par semaine
	private int hoursPerDay = 7; // nombre d'heures par jour
	private int workedHoursPerDay = 8; // nombre d'heures travaillees par jour
	
	private int calculateHoursPerWeek() {
		return daysPerWeek * workedHoursPerDay;
	}
	
	public int provideToEmployee() {
		return calculateHoursPerWeek();
	}
	
	public int provideToHR() {
		System.out.println("To HR");
		return calculateHoursPerWeek();
	}

}
