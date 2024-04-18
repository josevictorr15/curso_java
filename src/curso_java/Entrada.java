package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		System.out.println("Seu nome é: " + x);
		
		// Para ler um número inteiro
		int y;
		y = sc.nextInt();
		System.out.println("Sua idade: " + y);
		
		// Para ler um número flutuante
		double z;
		z = sc.nextDouble();
		System.out.println("Teu MMR é: " + z);
		
		// Para ler um caractere
		char c;
		c = sc.next().charAt(0);
		System.out.println("Seu gênero é: " + c);
		
		// Para ler vários dados na mesma linha
		String a;
		int b;
		double d;
		
		a = sc.next();
		b = sc.nextInt();
		d = sc.nextDouble();
		
		System.out.printf("Parábens %s, seu cadastro de número %d e código %.2f foi concluído com sucesso! ", a, b, d);
		
		// Para ler uma linha inteira
		
		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("LISTA DE NOMES:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);	
	
		sc.close();
		
		
		
		
		/* OBS:
		 * 	Quando você usa um comando de leitura diferente do nextLine() e dá alguma quebra de linha, essa quebra de linha
		 * fica "pendente" na entrada padrão.
		 * 
		 *  Se você então fizer um nextLine(), aquela quebra de linha pendente será absorvida pelo nextLine().
		 *  
		 *  Solução:
		 *  
		 *  Faça um nextLine() extra antes de fazer o nextLine() de seu interesse.
		 */

	}

}
