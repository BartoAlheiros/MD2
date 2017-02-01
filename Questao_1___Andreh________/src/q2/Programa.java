package q2;

import java.util.Scanner;

/*Implemente um programa que receba um conjunto de números no intervalo
0 <= x <= n -1 e devolva se o mesmo é um subgrupo de Zn*/

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TestadorSubgrupo testador = new TestadorSubgrupo();
		int n, conjunto[], k;
		boolean resultado;
		
		System.out.println("Digite o valor de n: ");
		n = sc.nextInt();
		sc.nextLine(); //limpando buffer do teclado.
		
		/*O número máximo de elementos que o usuário poderá digitar
		 * é n, se não vai dar ArrayIndexOutOfBoundsException
		 * e vai quebrar o sistema.*/
		
		System.out.println("Digite a quantidade de elementos do candidato a subgrupo: ");
		k = sc.nextInt();
		sc.nextLine();
		
		conjunto = new int[k];
		
		for(int i = 0; i < k; i++) {
			System.out.print("Digite o valor do"+ i + "o número: ");
			conjunto[i] = sc.nextInt();
			sc.nextLine();
		}
		 
		
		resultado = testador.testeSubgrupo(conjunto, n);
		
		if(resultado) {
			System.out.println("É subconjunto.");
		}else{
			System.out.println("Não é subconjunto.");
		}

	}

}
