import java.util.Random;

public class RandomNumberGenrtr {
	public static void main(String[] args)
	{
		Random rand = new Random();
		int number = rand.nextInt(100);
		System.out.println(number);
	}

}
