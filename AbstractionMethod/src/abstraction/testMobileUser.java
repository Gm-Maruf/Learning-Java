package abstraction;

public class testMobileUser {
	
	public static void main(String[] args)
	{
		MobileUser rv; ///Reference variable
		
		rv = new Person1();
		rv.sendSMS();
		rv.result();
		
		rv = new Person2();
		rv.sendSMS();
	}

}
