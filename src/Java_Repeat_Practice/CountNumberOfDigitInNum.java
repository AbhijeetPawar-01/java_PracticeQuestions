package Java_Repeat_Practice;

public class CountNumberOfDigitInNum {
	public static void main(String[] args) {

		int n = 1245;
		int count = 0;

		while (n != 0) {

			n = n / 10;
			
			count++;

		}

		System.out.println(count);
	}

}
