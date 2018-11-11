
public class teacher2 {
	
	int phn2;
	String address2, name2;
	
	teacher2(String naam2, String addr2, int phnn2)  ///Creating Constructor to pass parameter
	{
		name2 = naam2;
		address2 = addr2;
		phn2 = phnn2;
	}

	void displayInformation()     ///Creating Display method
	{
		System.out.println("Name: "+name2);
		System.out.println("Address: "+address2);
		System.out.println("Cell: "+phn2);
		System.out.println();
		
	}
	

}
