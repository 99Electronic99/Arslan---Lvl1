

	// Copyright Wintriss Technical Schools 2013
	import javax.swing.JOptionPane;
	import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.Colors;
	import org.teachingextensions.logo.Tortoise;
	

	public class TortoiseColorChooser {
		public static void main(String[] args) {
			Random r = new Random();
 Color arslan = new Color(r.nextInt(266),r.nextInt(266),r.nextInt(266));
for (int i = 0; i < 100000; i++) {
	

			//3. ask the user what color they would like the tortoise to draw
			String color = JOptionPane.showInputDialog("What color would you like?");
			//4. use an if/else statement to set the pen color that the user requested
if (color.equals("red")) {
	Tortoise.setPenColor(Color.red);
	
}
else if (color.equals("blue")) {
	Tortoise.setPenColor(Color.blue);

	
}
	//5. if the user doesn’t enter anything, choose a random color
else {
	Tortoise.setPenColor(arslan);
}
	//6. put a loop around your code so that you keep asking the user for more colors & drawing them
			
			//2. set the pen width to 10
			Tortoise.setPenWidth(10);
		//1. make the tortoise draw a shape (this will take more than one line of code)
Tortoise.penDown();
for (int iy = 0; iy < 4; iy++) {
	

Tortoise.move(50);
Tortoise.turn(90);
}
		}
	}
	}




