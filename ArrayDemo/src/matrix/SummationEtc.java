package matrix;

import java.util.Scanner;

public class SummationEtc {
	private static Scanner input;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		int[][] A = new int[3][3];
		int sum1 =  0;
		int sum2 = 0;
		int sum3 = 0;
		
		for(int row=0; row<3; row++)
		{
			for(int col=0; col<3; col++)
			{
				A[row][col] = input.nextInt();
			}
		}
		
		for(int row=0; row<3; row++)
		{
			for(int col=0; col<3; col++)
			{
				System.out.print(A[row][col]+"  ");
			}
			System.out.println();
		}
		
		for(int row=0; row<3; row++)
		{
			for(int col=0; col<3; col++)
			{
				if(row == col)
				{
					sum1 =  sum1 +A[row][col];
				}
				else if(row < col)
				{
					sum2 =  sum2 +A[row][col];
				}
				else if(row > col)
				{
					sum3 =  sum3 +A[row][col];
				}
			}
		}
		
		System.out.println("Summation of Diagonal elements of the matrix is: "+sum1);
		System.out.println("Summation of upper triangle elements is: "+sum2);
		System.out.println("Summation of lower triangle elements is: "+sum3);
	}
}
