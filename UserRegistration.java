package com.bridgelab.practice;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public boolean validateFirstName(String firstname) {
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher = pattern.matcher(firstname);
		return matcher.matches();
	}
        public boolean validateLastName(String lastname) {
		Pattern pattern= Pattern.compile("[A-Z][a-z]{2,}");
		Matcher matcher = pattern.matcher(lastname);
		return matcher.matches();
	}

}
