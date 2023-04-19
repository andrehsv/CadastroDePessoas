public class Pessoa {
	private String nome;
	
	private final CPF CPF;
	
	public Pessoa(String nome, CPF cpf) {
		this.nome = nome;
		CPF = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public CPF getCPF() {
		return CPF;
	}
}
