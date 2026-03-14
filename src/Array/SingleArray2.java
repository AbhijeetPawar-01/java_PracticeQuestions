package Array;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class SingleArray2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];

		for (int i = 0; i < a.length; i++) {

			a[i] = sc.nextInt();
		}

//		for (int i = 0; i < a.length; i++) {
//
//			// System.out.println(a[i]);
//		
//			
//		}

		for (int x : a) {
			System.out.println(x);
		}

	}

}
