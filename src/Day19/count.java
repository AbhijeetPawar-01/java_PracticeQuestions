package Day19;

public class count {
	public static void main(String[] args) {

		int a = 1234423;
		int count = 0;

		while (a != 0) {

			int rem = a % 10;
			count++;
			a = a / 10;

		}
		System.out.println(count);
	}

}
