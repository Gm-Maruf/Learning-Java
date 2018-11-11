import java.util.Scanner;

public class FiboNum {
	private static Scanner input;

	public static void main(String[] args)
	{
		int num;
		int first=0, second=1;
		int fibo;
		
		input = new Scanner(System.in);
		System.out.print("How many number till you want to show: ");
		num = input.nextInt();
		
		System.out.print(first+"  "+second);
		for(int i=3; i<num; i++)
		{
			fibo = first + second;
			System.out.print("  "+fibo);
			first = second;
			second = fibo;
		}
		System.out.println();
	}
}
