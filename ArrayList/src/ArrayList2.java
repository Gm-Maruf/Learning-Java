import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String[] args)
	{
		ArrayList<Integer> num1 = new ArrayList<>();
		ArrayList<Integer> num2 = new ArrayList<>();
		ArrayList<Integer> num3 = new ArrayList<>();
		
		num1.add(11);
		num1.add(21);
		num1.add(31);
		System.out.println("1st Array: "+num1);
		
		num2.add(10);
		num2.add(20);
		num2.add(30);
		System.out.println("2nd Array: "+num2);
		
		num3.addAll(num1);
		System.out.println("3rd Array: "+num3);
		
		boolean result = num1.equals(num2);
		System.out.println("Array1 == Array2 : "+result);
		result = num1.equals(num3);
		System.out.println("Array1 == Array2 : "+result);
	}

}
