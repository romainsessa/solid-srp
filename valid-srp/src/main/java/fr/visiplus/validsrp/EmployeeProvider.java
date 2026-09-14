package fr.visiplus.validsrp;

public class EmployeeProvider {
	
	private EmployeeData employeeData;
	
	public EmployeeProvider(EmployeeData employeeData) {
		this.employeeData = employeeData;
	}
	
	public int provideHoursPerWeek() {
		System.out.println("To Employee");
		return employeeData.getDaysPerWeek() * employeeData.getHoursPerDays(); // process
	}

}
