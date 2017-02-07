package q2;

import java.util.ArrayList;
import java.util.Scanner;

/*Implemente um programa que receba um conjunto de n�meros no intervalo
0 <= x <= n -1 e devolva se o mesmo � um subgrupo de Zn*/

public class Auxiliar {
	
	Scanner sc = new Scanner(System.in);
	
	
	public ArrayList<Integer> gerarZn(int n) {
		ArrayList<Integer> z = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			z.add(i);
		}
		
		return z;
	}
	
	public int recebeK() {
		int k;
		
		System.out.println("\nDigite a quantidade de elementos do candidato a subgrupo: ");
		k = sc.nextInt();
		sc.nextLine();
		
		return k;
	}
	
	public void ehVazio(int k) throws ConjuntoVazioException {
		
		if(k == 0) {
			throw new ConjuntoVazioException();
		}

	}
	
	public boolean temIdentidade(ArrayList<Integer> Z) throws NaoContemidentidadeException {
		boolean resultado = false;
		
		if(Z.contains(0) == false) {
			throw new NaoContemidentidadeException();
		} else {
			resultado = true;
		}
		
		return resultado;
	}
	
	// recebe o candidato a subconjunto(array de inteiros e devolve um boolean que indica se ele � subconjunto ou n�o.
	public boolean ehSubconjunto(ArrayList<Integer> conjuntoOriginal, ArrayList<Integer> candidatoASubconjunto) throws NaoEhsubconjuntoException {
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
				throw new NaoEhsubconjuntoException();
			}
		}


		return resultado2;
	}
	
	//verifica se a rodem de H divide a ordem de Zn
	public boolean ordemDivide(ArrayList<Integer> Z, ArrayList<Integer> H) throws OrdemNaodivideException {
		boolean resultado = false;
		
		if( (Z.size() % H.size() ) != 0) {
			throw new OrdemNaodivideException();
		}else {
			resultado = true;
		}
		
		return resultado;
	}
	
	//verifica se todo elemento do conjunto tem inverso
	public void temInverso() {
		
	}
	
	// G eh o grupo principal e H, o candidato a subgrupo de G;
	public boolean fechamento(ArrayList<Integer> Z, ArrayList<Integer> H) throws NaoHafechamentoException {
		boolean resultado = false;
		
		int k = H.size();
			
		if(k >= 3){
			
				
			for(k = k - 1; k > 0; k--){
				for(int j = k - 1; j > -1; j--) {
					if(Z.contains( ( H.get(k) + H.get(j) ) % Z.size()) ) {                  /*Para cada posi��o de Z eu verifico se a soma de alguma dupla de H m�dulo n � igual a esta posi��o. Se n�o tiver nenhuma*/
						resultado = true;
					}else{
						throw new NaoHafechamentoException();
					}
				}	
			}	

			

		}else if(k < 3){
			if(Z.contains(H.get(1) + H.get(0) % Z.size())) {
				resultado = true;
			}else {
				throw new NaoHafechamentoException();
			}
		}	
		
		
		return resultado;
	}
	
	
}
