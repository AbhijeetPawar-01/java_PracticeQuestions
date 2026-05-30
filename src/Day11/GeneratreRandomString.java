package Day11;

import java.util.Random;

public class GeneratreRandomString {
	public static void main(String[] args) {

		Random rand = new Random();
		int randNum = rand.nextInt(100);
		System.out.println(randNum);

	}

}
