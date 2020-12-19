package ecomerce;

public abstract class Pessoa {
	
	private String nome;
	private char genero;
	private int anoNascimento;
	
	
	public int voltaIdade() {
		return 2020 - anoNascimento;
		
		}
	
	public int voltaIdade(int anoAtual) {
		
		
		
		if (anoAtual==0)
		{
			System.out.println("ANO ATUAL INVALIDO!!");
			return 0;
		}
		else {
			return anoAtual - this.anoNascimento;
		}
		
		
		}
	
//construtor
	
	public Pessoa(String nome, char genero, int anoNascimento) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.anoNascimento = anoNascimento;
	}


	
	//get e set 
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public char getGenero() {
		return genero;
	}


	public void setGenero(char genero) {
		this.genero = genero;
	}


	public int getAnoNascimento() {
		return anoNascimento;
	}


	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	

	
	
	
	
	
	
	
}
