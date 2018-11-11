package conversion;

import java.util.Scanner;

public class NumberConversions {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int x;
		System.out.println("Enter any Integer Number: ");
		x = input.nextInt();
		String binary = Integer.toBinaryString(x);
		System.out.println("Binary value of 15 is: "+binary);
		
		String hexa = Integer.toHexString(x);
		System.out.println("Hexadecimal value of 15 is: "+hexa);
		
		String oct = Integer.toOctalString(x);
		System.out.println("Octal value of 15 is: "+oct);
		
		
	}

}
