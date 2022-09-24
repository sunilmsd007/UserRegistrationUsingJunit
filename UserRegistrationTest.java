package com.bridgelab.practice;
import org.junit.Test;
import org.junit.Assert;

public class UserRegistrationTest {

	UserRegistration user = new UserRegistration();

	@Test
	public void returnValidFirstName() {
		boolean result= user.validateFirstName("Sunil");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void returnInvalidFirstName() {
		boolean result = user.validateFirstName("sunil");
		Assert.assertEquals(false, result);
	}
}
