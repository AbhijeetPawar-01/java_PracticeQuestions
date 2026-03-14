package Java_Repeat_Practice;

public class ReverseString1 {

	public static void main(String[] args) {

		String name = "selenium";
		String rev = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			rev = rev + name.charAt(i);

		}
		System.out.println(rev);

	}

}
