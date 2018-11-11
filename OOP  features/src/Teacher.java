
public class Teacher {
	
	String name, address;
	int phn;
	
	void takinginput(String nam, String add, int ph)   ///Creating parameter method
	{
		name = nam;
		address = add;
		phn = ph;
	}
	
	void displayInformation()     ///Creating Display method
	{
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Cell: "+phn);
		System.out.println();
		
	}
	
	
	
	
	

}
