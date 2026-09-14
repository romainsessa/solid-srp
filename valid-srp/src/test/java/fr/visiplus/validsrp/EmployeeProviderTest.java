package fr.visiplus.validsrp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmployeeProviderTest {
	
	@Test
	public void testProvideHoursPerWeek() {
		
		//Arrange
		EmployeeData employeeData = new EmployeeData();
		EmployeeProvider employeeProvider = new EmployeeProvider(employeeData);
		
		//Act
		int result = employeeProvider.provideHoursPerWeek();
		
		//Assert
		assertEquals(35, result);
		
		
	}

}
