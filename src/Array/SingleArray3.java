package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SingleArray3 {
	public static void main(String[] args) {

		int[] a = new int[3];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}

//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		
//		for(int x : a) {
//			System.out.println(x);
//			
//		}
		
		System.out.println(Arrays.toString(a));

	}

}
