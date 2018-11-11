
public class Array2 {
	public static void main(String[] args)
	{
		int[][] number = new int[4][];
		int incr = 0;
		
		for(int i=0; i<4; i++)
		{
			for(int j=i+1; j<=i+1; j++)
			{
				number[i] = new int[j];
			}
		}
		
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<i+1; j++)
			{
				number[1][2] = incr;
				incr++;
			}
		}
		
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<i+1; j++)
			{
				System.out.print(number[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
