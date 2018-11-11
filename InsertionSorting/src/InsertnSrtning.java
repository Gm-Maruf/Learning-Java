import java.util.Scanner;

public class InsertnSrtning {
	private static Scanner in2;
	private static Scanner input;
	private static Scanner in3;

	public static void main(String[] args)
	{
		int n;
		in3 = new Scanner(System.in);
		n = in3.nextInt();
		for(int b=0; b<n; b++)
		{
			int inp;
			int[] number = new int[20];
			
			in2 = new Scanner(System.in);
			inp = in2.nextInt();
			
				input = new Scanner(System.in);
				for(int j=0; j<inp; j++)
				{
					number[j] = input.nextInt();
				}
				
				int count=0;
				for(int k=1; k<inp; k++)
				{
					for(int m=1; m<inp; m++)
					{
						if(number[m] <number[m-1])
						{
							int temp = number[m];
							number[m] = number[m-1];
							number[m-1] = temp;
							count++;
						}
					}
				}
				
				
				System.out.println("Optimal train swapping takes "+count+ " swaps.");
		}
	}
}
