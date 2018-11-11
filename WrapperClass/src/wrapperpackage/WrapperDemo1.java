package wrapperpackage;

public class WrapperDemo1 {
	public static void main(String[] args)
	{
		int x =30;
		Integer m = Integer.valueOf(x); ///Primitive to object
		System.out.println("value of x is: "+m);
		
		///autoBoxing
		Integer z = m; ///ো///////.////////////////////////////////
		System.out.println("value of x is: "+z);
		
		Double d = new Double(12.25);
		double d2 = d.doubleValue();  ///Object to Primitive
		System.out.println("value of d is: "+d2);
		
		double d3 = d;  ///unoxing
		System.out.println("value of d is: "+d3);
		
	}

}
