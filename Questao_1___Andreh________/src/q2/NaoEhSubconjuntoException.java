package q2;

public class NaoEhSubconjuntoException extends Exception {
	public NaoEhSubconjuntoException() {
		super("Não é subconjunto!" + "\n H Não é subgrupo.");
	}
}
