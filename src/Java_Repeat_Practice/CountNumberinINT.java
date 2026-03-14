package Java_Repeat_Practice;

public class CountNumberinINT {
	public static void main(String[] args) {

		int num = 1234434;

		int count = 0;
		int rem;
		while (num != 0) {

			num = num / 10; // 4

			count++;

		}
		num = num / 10;
		System.out.println(count);

	}

}
