package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area;
		
		raio = sc.nextDouble();
		area = 3.14159 * Math.pow(raio, 2);
		
		System.out.printf("A = %.4f", area);

	}

}
