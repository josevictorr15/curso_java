package curso_java;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		System.out.println("Olá mundo!");
		System.out.println("Bom dia!");
		
		// Imprimir um número inteiro na tela
		int y = 32;
		System.out.println(y);
		
		// Imprimir um número float na tela
		double x = 10.2323;
		System.out.println(x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x); // printf para imprimir algo formatado, "%n" é a quebra de linha independente da plataforma
		
		// Concatenação
		String name = "José";
		System.out.println("Bom dia " + name + ", tudo bem?");
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		// Concatenação de vários elementos
		int idade = 22; // FFFFFFFFFF
		double renda = 1.600; // Vai melhorar kk
		System.out.printf("%s tem %d de idade e possui uma renda de R$%.3f reais %n", name, idade, renda);
		
		// Casting (conversão explicita dos valores)
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		
		resultado = (double) a / b;
		
		System.out.println(resultado);
	}

}
