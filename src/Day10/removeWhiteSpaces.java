package Day10;

public class removeWhiteSpaces {
	public static void main(String[] args) {

		String[] arr = { " Abhije  ", " Sa meer ", " mohan p " };
		for (int i = 0; i < arr.length; i++) {

			arr[i] = arr[i].replaceAll("\\s+", "");

		}

		for (String x : arr) {

			System.out.println(x);

		}

	}

}
