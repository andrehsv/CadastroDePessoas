import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String prompt = "------------------------------------\n"
					  + " C A D A S T R O  D E P E S S O A S\n"
					  + "------------------------------------\n"
					  + "Formato do CPF: xxx.xxx.xxx-xx\n";
		CadastroDePessoas cp = new CadastroDePessoas();
		System.out.println(prompt);
		
		while(true) {
			String[] nomeEcpf = input();
			cp.addPessoa(nomeEcpf[0],nomeEcpf[1]);
			System.out.println(cp.getPessoas());
		}
	}
	
	static String[] input() {
		System.out.print("Digite o nome: ");
		String[] lista = new String[2];
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		lista[0] = input;
		System.out.print("Digite CPF: ");
		input = sc.nextLine();
		lista[1] = input;
		return lista;
	}
}