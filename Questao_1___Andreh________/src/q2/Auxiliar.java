package q2;

import java.util.ArrayList;
import java.util.Scanner;

/*Implemente um programa que receba um conjunto de números no intervalo
0 <= x <= n -1 e devolva se o mesmo é um subgrupo de Zn*/

public class Auxiliar {
	
	Scanner sc = new Scanner(System.in);
	
	public ArrayList<Integer> gerarZn(int n) {
		ArrayList<Integer> z = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			z.add(i);
		}
		
		return z;
	}
	
	
	// G eh o grupo principal e H, o candidato a subgrupo de G;
	public boolean fechamento(ArrayList<Integer> G, ArrayList<Integer> H) throws NaoHafechamentoException {
		boolean resultado = false;
		
		int k = H.size();
			
		if(k >= 3){
			
				
			for(k = k - 1; k > 0; k--){
				for(int j = k - 1; j > -1; j--) {
					if(G.contains(H.get(k) + H.get(j))) {                  /*Para cada posição de G eu verifico se a soma de alguma dupla de H é igual a esta posição. Se não tiver nenhuma*/
						resultado = true;
					}else{
						throw new NaoHafechamentoException();
					}
				}	
			}	

			

		}else if(k < 3){
			if(G.contains(H.get(1) + H.get(0))) {
				resultado = true;
			}else {
				throw new NaoHafechamentoException();
			}
		}	
		
		
		return resultado;
	}
	
	
	// recebe o candidato a subconjunto(array de inteiros e devolve um boolean que indica se ele é subconjunto ou não.
	public boolean ehSubconjunto(ArrayList<Integer> conjuntoOriginal, ArrayList<Integer> candidatoASubconjunto) throws NaoEhSubconjuntoException {
		boolean resultado1 = false, resultado2 = false;
		
		for(int i = 0; i < candidatoASubconjunto.size(); i++) {
			for(int j = 0; j < conjuntoOriginal.size(); j++){
				if(conjuntoOriginal.contains(candidatoASubconjunto.get(i))) {
					resultado1 = true;
				}else{
					resultado1 = false;
				}
			}
			if(resultado1 == true) {
				resultado2 = true;
			}else{
				resultado2 = false;
				throw new NaoEhSubconjuntoException();
			}
		}
		
		
		return resultado2;
	}
	
	public int trataK(int k) throws ConjuntoVazioException {
		
		if(k == 0) {
			throw new ConjuntoVazioException();
		}

		return k;
	}
	
	public int recebeK() {
		int k;
		
		System.out.println("\nDigite a quantidade de elementos do candidato a subgrupo: ");
		k = sc.nextInt();
		sc.nextLine();
		
		return k;
	}
}
