import java.util.Scanner;

public class PrimeSeries {
	private static Scanner input;

	public static void main(String[] args)
	{
		int count =0;
		
		input = new Scanner(System.in);
		System.out.print("Enter initial value: ");
		int init = input.nextInt();
		System.out.print("Enter Ending value: ");
		int end = input.nextInt();
		
		for(int i= init ; i<= end; i++)
		{
			for(int j= 2; j<i; j++)
			{
				if(i%j == 0)
				{
					count++;
					break;
				}
			}
			if(count== 0)
			{
				System.out.print(i+"  ");
			}
			count = 0;
		}
		
		
	}

}
