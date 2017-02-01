package q2;

import java.util.Scanner;

/*Implemente um programa que receba um conjunto de n�meros no intervalo
0 <= x <= n -1 e devolva se o mesmo � um subgrupo de Zn*/

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TestadorSubgrupo testador = new TestadorSubgrupo();
		int n, conjunto[];
		boolean resultado;
		
		System.out.println("Digite o valor de n: ");
		n = sc.nextInt();
		sc.nextLine(); //limpando buffer do teclado.
		conjunto = new int[n];
		/*O n�mero m�ximo de elementos que o usu�rio poder� digitar
		 * � n, se n�o vai dar ArrayIndexOutOfBoundsException
		 * e vai quebrar o sistema.*/
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite o valor do"+ i + "o n�mero: ");
			conjunto[i] = sc.nextInt();
			sc.nextLine();
		}
		 
		
		resultado = testador.teste(conjunto, n);
		
		if(resultado) {
			System.out.println("� subconjunto.");
		}else{
			System.out.println("N�o � subconjunto.");
		}

	}

}
