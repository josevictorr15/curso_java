package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, areaTriangle, areaCircle, areaTrapaze, areaSquare, areaRectangle;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		areaTriangle = (A * C) / 2;
		areaCircle = 3.14159 * Math.pow(C, 2);
		areaTrapaze = (A + B) * C / 2;
		areaSquare = Math.pow(B, 2);
		areaRectangle = A * B;
		
		System.out.printf("TRIÂNGULO: %.3f ", areaTriangle);
		System.out.printf("CÍRCULO: %.3f ", areaCircle);
		System.out.printf("TRAPÉZIO: %.3f ", areaTrapaze);
		System.out.printf("QUADRADO: %.3f ", areaSquare);
		System.out.printf("RETÂNGULO: %.3f ", areaRectangle);
		
		
	}

}
