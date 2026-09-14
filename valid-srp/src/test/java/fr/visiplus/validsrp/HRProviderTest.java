package fr.visiplus.validsrp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HRProviderTest {
	
	@Test
	public void testProvideHoursPerWeek() {
		
		//Arrange
		EmployeeData employeeData = new EmployeeData();
		HRProvider hrProvider = new HRProvider(employeeData);
		
		//Act
		int result = hrProvider.provideHoursPerWeek();
		
		//Assert
		assertEquals(40, result);
		
		
	}

}
