package q2;

import java.util.ArrayList;

/*Implemente um programa que receba um conjunto de números no intervalo
0 <= x <= n -1 e devolva se o mesmo é um subgrupo de Zn*/

public class Auxiliar {
	
	public ArrayList<Integer> gerarZn(int n) {
		ArrayList<Integer> z = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			z.add(i);
		}
		
		return z;
	}
	
	
	// G eh o grupo principal e H, o candidato a subgrupo de G;
	public boolean fechamento(int[] G, int[] H, int n) {
		ArrayList<Integer> soma = new ArrayList<Integer>();
		int j = 0;
		
		for(int i = 0; i < G.length; i++) {
			do {
				if(G[i] == H[j] + H[j++]) {
					
				}
				
			}while(j < H.length - 2);
		}
		
		
		return false;
	}
	
	
	// recebe o candidato a subconjunto(array de inteiros e devolve um boolean que indica se ele é subconjunto ou não.
	public boolean ehSubconjunto(ArrayList<Integer> conjuntoOriginal, ArrayList<Integer> candidatoASubconjunto) {
		boolean resultado1 = false, resultado2 = false;
		
		for(int i = 0; i < candidatoASubconjunto.size(); i++) {
			for(int j = 0; j < conjuntoOriginal.size(); j++){
				if(candidatoASubconjunto.get(i) == conjuntoOriginal.get(j)) {
					resultado1 = true;
				}else{
					resultado1 = false;
				}
			}
			if(resultado1 == true) {
				resultado2 = true;
			}else{
				resultado2 = false;
			}
		}
		
		return resultado2;
	}
}
