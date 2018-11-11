
public class MakingObject {
	public static void main(String[] args)
	{
		Teacher object1 = new Teacher();
		object1.name = "Gm Maruf";
		object1.address = "Rajshahi";
		object1.phn = 1234;
		object1.displayInformation();
		
		
		
		Teacher object2 = new Teacher();
		object2.takinginput("Arefin Siddique", "CSE ru", 5678);
		object2.displayInformation();
		
		
		teacher2 object3 = new teacher2("Faruk Sir", "CSE ru", 91011);
		object3.displayInformation();
	}

}
