package Day10;

public class howToremoveSpecialCharInArray {
	public static void main(String[] args) {

		String[] arr = { "@#Abhije!", "%Sameer@", "#mohanp^" };

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i].replaceAll("[^a-zA-Z0-9]", " ");
		}

		for (String x : arr) {

			System.out.println(x);
		}

	}

}
