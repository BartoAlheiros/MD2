package q2;

import java.util.ArrayList;
import java.util.Scanner;

/*Implemente um programa que receba um conjunto de números no intervalo
0 <= x <= n -1 e devolva se o mesmo é um subgrupo de Zn*/

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Auxiliar auxiliar = new Auxiliar(); //Classe auxiliar que contém métodos auxiliares para executar o algoritmo e verificar se é subgrupo ou não.
		ArrayList <Integer> conjunto = new ArrayList<Integer>();
		ArrayList <Integer> z = new ArrayList<Integer>();
		int n, k, var;
		boolean resultado;
		
		System.out.println("Digite o valor de n: ");
		n = sc.nextInt();
		sc.nextLine(); //limpando buffer do teclado.
		
		
		z = auxiliar.gerarZn(n);
		
		
		
		
		/*O número máximo de elementos que o usuário poderá digitar
		 * é n, se não vai dar ArrayIndexOutOfBoundsException
		 * e vai quebrar o sistema.*/
		
		System.out.println("Digite a quantidade de elementos do candidato a subgrupo: ");
		k = sc.nextInt();
		sc.nextLine();
		
		
		for(int i = 0; i < k; i++) {
			System.out.print("Digite o valor do"+ i + "o número: ");
			conjunto.add(sc.nextInt());
			sc.nextLine();
		}
		
		resultado = auxiliar.ehSubconjunto(z, conjunto);
		
		if(resultado == true){
			
		}else{
			System.out.println("Não é subconjunto.");
		}
		 

	}

}
