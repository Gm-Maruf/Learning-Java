package JGraphics;

import javax.swing.*;

public class creatingFrame2 {
	public static void main(String[] args)
	{
		JFrame ob = new JFrame("First Frame");
		
		ob.setVisible(true);
		
		 ob.setBounds(100,100,400,600);
		 
		 ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 JButton button = new JButton();
		 button.setText("Click here");
		 
		 ob.add(button);
	}

}
