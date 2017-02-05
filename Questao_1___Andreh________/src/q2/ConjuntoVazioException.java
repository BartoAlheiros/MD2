package q2;

public class ConjuntoVazioException extends Exception {
	public ConjuntoVazioException() {
		super("Erro: O conjunto não pode ser vazio! Digite um conjunto válido.");
	}
}
