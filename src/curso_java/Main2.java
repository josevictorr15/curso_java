package curso_java;

public class Main2 {

	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("A raiz quadrada de " + x + " é igual a " + A);
		System.out.println("A raiz quadrada de " + y + " é igual a " + B);
		System.out.println("A raiz quadrada de 25 é igual a " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado a 2 = " + B);
		System.out.println("5 elevado a 2 = " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
	}

}
