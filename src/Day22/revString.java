package Day22;

public class revString {
	public static void main(String[] args) {

		String s = "selenium";
		String rev = "";

//		for (int i = s.length() - 1; i >= 0; i--) {
//			rev = rev + s.charAt(i);
//
//		}

		// System.out.println(rev);

		// 2nd way

		char[] a = s.toCharArray();

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + a[i];

		}
		System.out.println(rev);
	}
}
