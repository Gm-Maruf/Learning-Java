import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args)
	{
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(3, 40);
		
		System.out.print(number);
		System.out.println();
		System.out.print("Size of the array list = "+number.size());
	}

}
