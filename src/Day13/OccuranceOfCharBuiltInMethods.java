package Day13;

public class OccuranceOfCharBuiltInMethods {
	public static void main(String[] args) {

		String s = "Welcome to java selenium";

		int actualLength = s.length();

		System.out.println(actualLength);

		int aferReplacing = s.replace("e", "").length();
		System.out.println(aferReplacing);

		System.out.println("occurance of e :" + (actualLength - aferReplacing));

	}

}
