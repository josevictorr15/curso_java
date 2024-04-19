package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num, hours;
		double hourlyRate, salary;
		
		num = sc.nextInt();
		hours = sc.nextInt();
		hourlyRate = sc.nextDouble();
		
		salary = hours * hourlyRate;
		
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f", salary);

	}

}
