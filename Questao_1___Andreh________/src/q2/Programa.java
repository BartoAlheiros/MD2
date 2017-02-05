package q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*Implemente um programa que receba um conjunto de números no intervalo
0 <= x <= n -1 e devolva se o mesmo é um subgrupo de Zn*/

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Auxiliar auxiliar = new Auxiliar(); //Classe auxiliar que contém métodos auxiliares para executar o algoritmo e verificar se é subgrupo ou não.
		ArrayList <Integer> conjunto = new ArrayList<Integer>();
		ArrayList <Integer> z = new ArrayList<Integer>();
		int n, k = 0;
		boolean resultadoSubconjunto = false, resultadoFechamento = false;
		
		System.out.println("Digite o valor de n: ");
		n = sc.nextInt();
		sc.nextLine(); //limpando buffer do teclado.
		
		
		z = auxiliar.gerarZn(n);
		
		System.out.println("Z" + n + " = " + Arrays.toString(z.toArray()));

		
		do{
			k = auxiliar.recebeK();
			
			try {
				auxiliar.trataK(k);
			} catch (ConjuntoVazioException e1) {
				System.err.println(e1.getMessage());
			}
		}while(k == 0);	
			

		for(int i = 0; i < k; i++) {
			System.out.print("Digite o valor do "+ (i + 1) + "o número: ");
			conjunto.add(sc.nextInt());
			sc.nextLine();
		}
		
		try {
			resultadoSubconjunto = auxiliar.ehSubconjunto(z, conjunto);
			if(resultadoSubconjunto == true) {
				System.out.println("É subconjunto.");
			}
		} catch (NaoEhSubconjuntoException e) {
			System.err.println(e.getMessage());
			System.exit(0);
		}
		
		try {
			resultadoFechamento = auxiliar.fechamento(z, conjunto);
		} catch (NaoHafechamentoException e) {
			System.err.println(e.getMessage());
		}
		
		if(resultadoSubconjunto == true && resultadoFechamento == true) {
			System.out.println("É subgrupo.");
		}else{
			System.out.println("Não é subgrupo");
		}

	}

}
