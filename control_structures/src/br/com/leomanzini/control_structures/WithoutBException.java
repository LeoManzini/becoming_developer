package br.com.leomanzini.control_structures;

@SuppressWarnings("serial")
public class WithoutBException extends Exception {
	
	@Override
	public String getMessage() {
		return "Don't exist a letter B at your phrase.";
	}
}
