package fr.visiplus.validsrp;

public class EmployeeProvider {
	
	private EmployeeData employeeData;
	
	public EmployeeProvider(EmployeeData employeeData) {
		this.employeeData = employeeData;
	}
	
	public int provideHoursPerWeek() {
		return employeeData.getDaysPerWeek() * employeeData.getHoursPerDays();
	}

}
