package q2;

public class NaoEhsubconjuntoException extends Exception {
	public NaoEhsubconjuntoException() {
		super("Não é subconjunto!" + "\n H Não é subgrupo.");
	}
}
