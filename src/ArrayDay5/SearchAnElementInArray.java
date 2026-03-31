package ArrayDay5;

public class SearchAnElementInArray {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 30, 30, 40 };
		int searchEle = 30;

		boolean status = false;

//		for (int i = 0; i < a.length; i++) {
//
//			if (a[i] == searchEle) {
//				status = true;
//				System.out.println("ele found");
//				break;
//			}
//
//		}
//
//		if (status == false) {
//			System.out.println("ele not found");
//
//		}

		// Using enhanced loop

		for (int x : a) {

		

			if (x == searchEle) {

				status = true;
				System.out.println("ele found");
				break;
			}
			if (status == false) {
				
				System.out.println("ele not found");

			}

		}

	}

}
