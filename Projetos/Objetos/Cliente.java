package Objetos;

public class Cliente extends Pessoa{
	
	private String CPF;

	public String getCPF() {
		return CPF;
	}

	
	public Cliente(String nome, char genero, int anoNascimento, String cPF) {
		super(nome, genero, anoNascimento);
		CPF = cPF;
	}


	public void corrigirCPF(String CPF) {
		this.CPF = CPF;
	}
	

}