package q5717;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			int result = sc.nextInt() + sc.nextInt();
			if (result == 0) {
				break;
			}
			System.out.println(result);

		}
		sc.close();

	}

}
