package q10995;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (n == 1) {
					System.out.print("*");
					break;

				} else if (i % 2 == 0) {
					System.out.print("* ");
				} else {
					System.out.print(" *");
				}

			}
			System.out.println("");
		}

	}

}
