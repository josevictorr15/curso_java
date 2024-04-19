package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int code1, numbers1, code2, numbers2;
		double value1, value2, finalValue1, finalValue2, price;
		
		code1 = sc.nextInt();
		numbers1 = sc.nextInt();
		value1 = sc.nextDouble();
		code2 = sc.nextInt();
		numbers2 = sc.nextInt();
		value2 = sc.nextDouble();
		
		finalValue1 = numbers1 * value1;
		finalValue2 = numbers2 * value2;
		
		price = finalValue1 + finalValue2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", price);

	}

}
