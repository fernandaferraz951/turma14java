package Objetos;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Pessoa {
	public String nome;
	public char genero;
	public int anoNascimento;
	public Pessoa() {
		
	}


	//construtor 
	
	public Pessoa(String nome) {
		this.nome=nome;
		
		
	}
	
	public Pessoa(String nome, char genero) {
		this.nome=nome;
		this.genero=genero;
	}

	public Pessoa(String nome, char genero, int anoNascimento) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.anoNascimento = anoNascimento;
	}


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
	
	public int voltaIdade() {
		Calendar ano = GregorianCalendar.getInstance();
		int anoAtual=ano.get(Calendar.YEAR);

		return (anoAtual - this.anoNascimento);
	}
}
