package Day21;

public class RemoveJunkFromString {
	public static void main(String[] args) {

		String s = "!@#$$#anhi123";
		s = s.replaceAll("[^0-9a-zA-Z]", "");
		System.out.println(s);
	}

}