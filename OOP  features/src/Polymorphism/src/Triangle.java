
public class Triangle extends Area {
	double base, height;
	
	Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}
	
     public double areaa()
	{
		System.out.println("Area of the triangle is: ");
		
		return 0.5*base*height;
	}

}
