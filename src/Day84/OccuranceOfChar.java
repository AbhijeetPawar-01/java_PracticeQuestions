package Day84;

public class OccuranceOfChar {
	public static void main(String[] args) {

		String s = "java programming jaba oops selenim";
		int count = s.length();
		System.out.println(count);
		
		int rep = s.replace("a", " ").length();
		
		int c = count - rep;
		
		System.out.println(c);

	}

}
