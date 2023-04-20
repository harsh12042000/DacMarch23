package in.exam.utils;

public class Validator{
	
	public static final String EMAIL_PATTERN= "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
	public static boolean validateEmail( String email ) {
		return email.matches(EMAIL_PATTERN);
	}
	
	public static final String PHONE_NUMBER_PATTERN= "^\\d{10}$";
	public static boolean validatePhoneNumber( String phoneNumber ) {
		return phoneNumber.matches(PHONE_NUMBER_PATTERN);
	}
}
