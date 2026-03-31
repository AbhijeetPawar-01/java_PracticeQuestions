package Day10;

public class removeSpecialChar {
	public static void main(String[] args) {

		String arr[] = { "!abhijeet^", "$Chhaya*", "!Mohan*" };

		for (int i = 0; i < arr.length; i++) {

			arr[i] = arr[i].replaceAll("[^	a-zA-Z0-9]", "");
		    
		}
		
		for (String c : arr) {

			System.out.println(c);

		}
	}

}
