package q2;

/*Implemente um programa que receba um conjunto de números no intervalo
0 <= x <= n -1 e devolva se o mesmo é um subgrupo de Zn*/

public class TestadorSubgrupo {
	
	public boolean testeSubgrupo(int[] conjunto, int n) {
		int[] z = new int[n];
		boolean fechamento;
		
		z = this.gerarZn(n);
		
		fechamento = this.fechamento(conjunto);
		
		
		
		
		return false;
	}
	
	public int[] gerarZn(int n) {
		int[] z = new int[n];
		
		for(int i = 0; i < n; i++) {
			z[i] = i;
		}
		
		return z;
	}
	
	public boolean fechamento(int[] conjunto) {
		
		return false;
	}
	
}
