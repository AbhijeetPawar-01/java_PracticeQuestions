package Day15;

public class removejunk {
	public static void main(String[] args) {

		String s = "!@$% qwdef 3546";

		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
