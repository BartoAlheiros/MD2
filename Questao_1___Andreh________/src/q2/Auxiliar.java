package q2;

/*Implemente um programa que receba um conjunto de números no intervalo
0 <= x <= n -1 e devolva se o mesmo é um subgrupo de Zn*/

public class Auxiliar {
	
	public boolean testeSubgrupo(int[] conjunto, int n) {
		int[] z = new int[n];
		boolean fechamento;
		
		z = this.gerarZn(n);
		
		//fechamento = this.fechamento(conjunto);
		
		
		
		
		return false;
	}
	
	public int[] gerarZn(int n) {
		int[] z = new int[n];
		
		for(int i = 0; i < n; i++) {
			z[i] = i;
		}
		
		return z;
	}
	
	public boolean fechamento(int[] G, int[] H, int n) {
		int[] soma = new int[n];
		
		for(int i = 0; i < G.length; i++) {
			for(int j = 0; j < H.length; j++) {
				
			}
		}
		
		
		return false;
	}
	
	
	// recebe o candidato a subconjunto(array de inteiros e devolve um boolean que indica se ele é subconjunto ou não.
	public boolean ehSubconjunto(int[] conjuntoOriginal, int[] candidatoASubconjunto) {
		boolean resultado1 = false, resultado2 = false;
		
		for(int i = 0; i < candidatoASubconjunto.length; i++) {
			for(int j = 0; j < conjuntoOriginal.length; j++){
				if(candidatoASubconjunto[i] == conjuntoOriginal[j]) {
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
