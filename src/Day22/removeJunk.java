package Day22;

public class removeJunk {
	public static void main(String[] args) {

		String str = "@#$selenium123";
		String s = str.replaceAll("[^a-zA-Z0-9]", "");

		System.out.println(s);
	}
}
