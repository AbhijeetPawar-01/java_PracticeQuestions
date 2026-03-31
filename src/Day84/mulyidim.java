package Day84;

import java.util.Arrays;
import java.util.Scanner;

public class mulyidim {
	public static void main(String[] args) {

		int[][] a = new int[2][2];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {
				
				a[i][j]=sc.nextInt();

			}
		}
		
		
		for(int []x : a) {
			
			
			System.out.println(Arrays.toString(x));
		}

	}

}
