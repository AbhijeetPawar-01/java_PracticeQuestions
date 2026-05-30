package Day11;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Selenium";

//		char[] a = str.toCharArray();
		String rev = "";
//
//		for (int i = str.length() - 1; i >= 0; i--) {
//
//			rev = rev + a[i];
//
//		}
//		System.out.println(rev);

		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);

		}
		System.out.println(rev);

	}

}
