package q2;

public class NaoTeminversoException extends Exception {
	public NaoTeminversoException() {
		super("O conjunto H não tem inverso para todo x pertencente a H.");
	}
}
