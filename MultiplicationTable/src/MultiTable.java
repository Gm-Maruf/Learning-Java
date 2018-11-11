import java.util.Scanner;

public class MultiTable {
	private static Scanner input;

	public static void main(String[] args)
	{
		int x;
		int tmp=1;
		input = new Scanner(System.in);
		System.out.print("Enter any Number which'll make Multiplication Table: ");
		x = input.nextInt();
		
		for(int i=1; i<=10; i++)
		{
			System.out.printf("%d  X  %d =  %d\n",x,i,i*x);
			tmp = 1;
		}
	}

}
