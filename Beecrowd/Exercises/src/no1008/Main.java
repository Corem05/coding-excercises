package no1008;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int NUMBER = sc.nextInt();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double SALARY = B * C;
		System.out.println("NUMBER = " + NUMBER);
		System.out.println("SALARY = U$ " + String.format("%.2f", SALARY).replace(',', '.'));
		sc.close();
	}
}
