package com.bridgelab.practice;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
public class UserRegistrationTest {

   @RunWith(Parameterized.class)
   public class UserRegistrationTest {
	String emailID;
	boolean expectedResult;
	UserRegistration user;

	public UserRegistrationTest(String emailID, boolean expectedResult) {
		this.emailID = emailID;
		this.expectedResult = expectedResult;
	}

	@Before
	public void initialize() {
		user = new UserRegistration();
	}

	@Parameterized.Parameters
	public static Collection emails() {
		return Arrays.asList(new Object[][] { { "abc.xyz@bl.co.in", true }, { "abc+100@gmail.com", true },
				{ "abcd@.com", false }, { ".abc@yahoo.com.in", false }, });
	}

	@Test
	public void validateMultipleEmails() {
		assertEquals(expectedResult, user.validateEmail(emailID));
	}
   }
}
