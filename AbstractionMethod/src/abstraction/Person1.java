package abstraction;

public class Person1 extends MobileUser {
	
	@Override
	void sendSMS()
	{
		System.out.println("Messege send to Person 1");
	}

}
