import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> number = new ArrayList<>();
		
		System.out.println("Size is: "+number.size() );
		
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(3,50);
		
		System.out.println(number);
		System.out.println("Size is: "+number.size() );
		
	}

}
