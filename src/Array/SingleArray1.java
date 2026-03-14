package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SingleArray1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];

		for (int i = 0; i < a.length; i++) {

			a[i] = sc.nextInt();

		}

		//methos 1
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		
		//methos 2
		//System.out.println(Arrays.toString(a));
		
		
		for(int x: a) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	

}
