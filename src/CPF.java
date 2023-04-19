import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CPF {
	private final String CPF;
	
	public CPF(String cpf) {
		CPF = cpf;
	}

	public String getCPF() {
		return CPF;
	}

	
	@Override
	public String toString() {
		return CPF;
	}
	
	public boolean isValido() throws CpfInvalidoException {
		boolean valido;
		
		Pattern patternCPF = Pattern.compile("[[^a-zA-Z]0-9][[^a-zA-Z]0-9][[^a-zA-Z]0-9]."
				+ "[[^a-zA-Z]0-9][[^a-zA-Z]0-9][[^a-zA-Z]0-9]."
				+ "[[^a-zA-Z]0-9][[^a-zA-Z]0-9][[^a-zA-Z]0-9]-"
				+ "[[^a-zA-Z]0-9][[^a-zA-Z]0-9]");
		boolean matchesCPF = patternCPF.matcher(this.getCPF()).matches();
		
		if(matchesCPF) {
			valido = true;
		} else {
			valido = false;
			throw new CpfInvalidoException("CPF inválido");
		}
		return valido;
	}
}
