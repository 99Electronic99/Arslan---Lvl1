import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

public class Houses {
	public static void main(String[] args) {

		StartAtBottom();
		for (int i = 0; i < 9; i++) {

			house("small");
		}
	}

	static void StartAtBottom() {
		Tortoise.setX(50);
		Tortoise.setY(450);

	}

	static void house(String Size) {
		int small = 60;
		int medium = 120;
		int large = 250;
		if (Size.equals("small")) {
			Tortoise.setPenColor(Color.PINK);
			Tortoise.move(small);
			Tortoise.turn(90);
			Tortoise.move(40);
			Tortoise.turn(90);
			Tortoise.move(small);
			Tortoise.turn(-90);
			Tortoise.setPenColor(Color.green);
			Tortoise.move(20);
			Tortoise.turn(-90);

		}

	}
}
