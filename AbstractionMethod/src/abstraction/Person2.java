package abstraction;

public class Person2 extends MobileUser {
	
	@Override
	void sendSMS()
	{
		System.out.println("Messege send to Person 2");
	}

}
