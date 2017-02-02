package q2;

import java.util.Scanner;

/*Implemente um programa que receba um conjunto de n�meros no intervalo
0 <= x <= n -1 e devolva se o mesmo � um subgrupo de Zn*/

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Auxiliar auxiliar = new Auxiliar(); //Classe auxiliar que cont�m m�todos auxiliares para executar o algoritmo e verificar se � subgrupo ou n�o.
		int n, conjunto[], k, z[];
		boolean resultado;
		
		System.out.println("Digite o valor de n: ");
		n = sc.nextInt();
		sc.nextLine(); //limpando buffer do teclado.
		z = new int[n];
		
		z = auxiliar.gerarZn(n);
		
		
		
		
		/*O n�mero m�ximo de elementos que o usu�rio poder� digitar
		 * � n, se n�o vai dar ArrayIndexOutOfBoundsException
		 * e vai quebrar o sistema.*/
		
		System.out.println("Digite a quantidade de elementos do candidato a subgrupo: ");
		k = sc.nextInt();
		sc.nextLine();
		
		conjunto = new int[k];
		
		for(int i = 0; i < k; i++) {
			System.out.print("Digite o valor do"+ i + "o n�mero: ");
			conjunto[i] = sc.nextInt();
			sc.nextLine();
		}
		
		resultado = auxiliar.ehSubconjunto(z, conjunto);
		
		if(resultado == true){
			
		}else{
			System.out.println("N�o � subconjunto.");
		}
		 

	}

}
