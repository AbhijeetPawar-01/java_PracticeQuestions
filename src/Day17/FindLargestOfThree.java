package Day17;

public class FindLargestOfThree {
	public static void main(String[] args) {

		int a = 122;
		int b = 3456;
		int c = 789;

		if (a > b && a > c) {
			System.out.println("a is grater");
		}

		else if (b > a && b > c) {
			System.out.println("b is grate");
		} else {
			System.err.println("c is rater");
		}

	}
}
