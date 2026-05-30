package Day17;

public class removeSpace {
	public static void main(String[] args) {

		String s = " welcome to java  ";

		s = s.replaceAll("\\s", "");
		System.out.println(s);
		System.out.println(s.length());
	}

}
