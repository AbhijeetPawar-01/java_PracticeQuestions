package Day84;

import java.util.Random;

public class generateRandomNumber {
	public static void main(String[] args) {

		Random r = new Random();
		int num = r.nextInt(1000);
		System.out.println(num);

//		String num = RandomStringUtils.randomNumeric(10);

	}
}
