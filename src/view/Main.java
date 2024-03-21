package view;

import java.util.Scanner;

import controller.ConvertController;

public class Main {

	public static void main(String[] args) throws Exception {

		ConvertController convertController = new ConvertController();
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Decimal: ");
			Integer n = sc.nextInt();
			while (n > 1000) {
				System.out.println("Limit: 1000");
				n = sc.nextInt();
			}
			String bin = convertController.decToBin(n);
			System.out.println("Binary: " + bin);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
		sc.close();
	}

}
