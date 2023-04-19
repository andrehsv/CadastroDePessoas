import java.util.Map;
import java.util.HashMap;

public class CadastroDePessoas {
	private Map<String,CPF> pessoas = new HashMap<>();

	public Map<String, CPF> getPessoas() {
		return pessoas;
	}
	
	public boolean addPessoa(String nome, String numeroCpf) {
		CPF cpf = new CPF(numeroCpf);
		Pessoa pessoa = new Pessoa(nome, cpf);
		
		try {
			if(cpf.isValido()) {
				pessoas.put(pessoa.getNome(), pessoa.getCPF());
				return true;
			}
		} catch (CpfInvalidoException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	
}
