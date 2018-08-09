package main;

import java.util.Random;

public class ChandraTest {

	public static void main(String[] args) {
		int[] values = { 1, 2, 3 };
		int[][] array = new int[3][3];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				int a = new Random().nextInt(j);
				System.out.println(a);
				System.out.print(array[i][j] = values[a]);
				System.out.print("  ");
			}
			System.out.println("  ");
			System.out.println();
		}
	}
}
