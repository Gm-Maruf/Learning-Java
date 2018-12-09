package bigJava;
import java.util.Scanner;

public class QuestionDemo1 {
	private static Scanner in;

	public static void main(String[] args)
	{
		in = new Scanner(System.in);
		Question q = new Question();
		
		q.setText("Who was the inventor of Java?");
		q.setAnswer("James Gosling");
		q.display();
		
		System.out.println("Your answer: ");
		String response = in.nextLine();
		System.out.println(q.checkAnswer(response));
	}

}
