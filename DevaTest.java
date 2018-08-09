package main;

public class DevaTest {

	public static void main(String[] args) {

		int rows = 9;
		int coloumn = 9;
		int temp = 0;
		int[][] arr = new int[rows][coloumn];

		arr[1][8] = 8;
		arr[2][5] = 7;
		arr[3][2] = 5;
		arr[4][6] = 9;
		arr[5][4] = 9;
		arr[6][2] = 2;
		arr[7][1] = 6;
		arr[8][6] = 8;
		arr[0][0] = 3;
		System.out.println("Initial Array");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}

		for (int i = 0; i < rows; i++) { // 3
			for (int j = 0; j < coloumn; j++) {
				for (int k = j + 1; k < coloumn; k++) {
					if (arr[i][j] != arr[i][k] && arr[i][j] < 9)
						temp = arr[i][k];
					temp = temp + 1;
					arr[i][k] = temp;
				}
			}
		}
		System.out.println("Final Array ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < coloumn; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
