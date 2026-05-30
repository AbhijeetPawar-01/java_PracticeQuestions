package Day14;

public class SwapNumber {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		System.out.println("befor" + a);
		System.out.println("befor" + b);
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a);
		System.out.println(b);
	}

}
