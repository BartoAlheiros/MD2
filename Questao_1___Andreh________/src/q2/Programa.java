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
		ArrayList <Integer> H = new ArrayList<Integer>();
		ArrayList <Integer> Z = new ArrayList<Integer>();
		int n, k = 0;
		boolean resultadoSubconjunto = false, resultadoFechamento = false, resultadoIdentidade = false, resultadoOrdemDivide = false, resultadoInverso = false;
		
		System.out.println("Digite o valor de n: ");
		n = sc.nextInt();
		sc.nextLine(); //limpando buffer do teclado.
		
		
		Z = auxiliar.gerarZn(n);
		
		System.out.println("Z" + n + " = " + Arrays.toString(Z.toArray()));

		
		do{
			k = auxiliar.recebeK();
			
			try {
				auxiliar.ehVazio(k);
			} catch (ConjuntoVazioException e1) {
				System.err.println(e1.getMessage());
			}
		}while(k == 0);	
			

		for(int i = 0; i < k; i++) {
			System.out.print("Digite o valor do "+ (i + 1) + "o elemento: ");
			H.add(sc.nextInt());
			sc.nextLine();
		}
		
		try {
			resultadoSubconjunto = auxiliar.ehSubconjunto(Z, H);
			if(resultadoSubconjunto == true) {
				System.out.println("É subconjunto.");
			}
		} catch (NaoEhsubconjuntoException e) {
			System.err.println(e.getMessage());
			System.exit(0);
		}
		
		try {
			resultadoIdentidade = auxiliar.temIdentidade(H);
			if(resultadoIdentidade == true) {
				System.out.println("Tem identidade");
			}
		} catch (NaoContemidentidadeException e1) {
			System.err.println(e1.getMessage());
		}
		
		try {
			resultadoOrdemDivide = auxiliar.ordemDivide(Z, H);
		} catch (OrdemNaodivideException e1) {
			System.err.println(e1.getMessage());
		}
		
		try {
			resultadoInverso = auxiliar.temInverso(Z, H);
		} catch (NaoTeminversoException e1) {
			System.err.println(e1.getMessage());
		}
		
		try {
			resultadoFechamento = auxiliar.fechamento(Z, H);
		} catch (NaoHafechamentoException e) {
			System.err.println(e.getMessage());
		}
		
		if(resultadoIdentidade == true && resultadoSubconjunto == true && resultadoOrdemDivide == true && resultadoInverso == true && resultadoFechamento == true) {
			System.out.println("É subgrupo.");
		}else{
			System.out.println("Não é subgrupo");
		}

	}

}
