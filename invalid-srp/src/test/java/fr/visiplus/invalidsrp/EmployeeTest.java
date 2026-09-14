package fr.visiplus.invalidsrp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmployeeTest {
	
	@Test
	public void testProvideToEmployee() {
		//Arrange
		Employee employee = new Employee();
		
		//Act
		int result = employee.provideToEmployee();
		
		//Assert
		assertEquals(35, result);		
		
	}
	
	@Test
	public void testProvideToHR() {
		//Arrange
		Employee employee = new Employee();
		
		//Act
		int result = employee.provideToHR();
		
		//Assert
		assertEquals(40, result);		
		
	}


}
