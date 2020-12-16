package lista2poo;

public class Administrador extends Pessoa {
	private double ajudaDecusto;

	public Administrador(String nome, String endereco, String telefone, double ajudaDecusto) {
		super(nome, endereco, telefone);
		this.ajudaDecusto = ajudaDecusto;
	}

	public double getAjudaDecusto() {
		return ajudaDecusto;
	}

	public void setAjudaDecusto(double ajudaDecusto) {
		this.ajudaDecusto = ajudaDecusto;
	}
	
	
	
	
	
	

}
