package fr.visiplus.validsrp;

public class HRProvider {

	private EmployeeData employeeData;
	
	public HRProvider(EmployeeData employeeData) {
		this.employeeData = employeeData;
	}
	
	public int provideHoursPerWeek() {
		System.out.println("To HR");
		return employeeData.getDaysPerWeek() * employeeData.getWorkedHoursPerDay(); // process
	}
	
}
