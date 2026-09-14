package fr.visiplus.validsrp;

public class HRProvider {

	private EmployeeData employeeData;
	
	public HRProvider(EmployeeData employeeData) {
		this.employeeData = employeeData;
	}
	
	public int provideHoursPerWeek() {
		return employeeData.getDaysPerWeek() * employeeData.getWorkedHoursPerDay();
	}
	
}
