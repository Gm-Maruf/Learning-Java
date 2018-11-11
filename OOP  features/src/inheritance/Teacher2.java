package inheritance;

public class Teacher2 extends Person1 {
	private String qualificaton;
	
	public void setQualificaton(String qualificaton) {
		this.qualificaton = qualificaton;
	}
	public String getQualificaton() {
		return qualificaton;
	}
	
	void displayinfo()
	{
		System.out.println("Name: "+getName());
		System.out.println("Age: "+getAge());
		System.out.println("Qualification: "+getQualificaton());
		
	}

}
