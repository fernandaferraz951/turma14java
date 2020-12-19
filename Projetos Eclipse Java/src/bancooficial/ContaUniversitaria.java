package bancooficial;

public class ContaUniversitaria extends ContaEspecial {

	private double emprestimoUniversitario;
	
	

	public ContaUniversitaria(int numeroConta, String CPF, double valorLimite, double emprestimoUniversitario) {
		super (numeroConta, CPF, valorLimite);
		this.emprestimoUniversitario = emprestimoUniversitario;
	}

	public double getEmprestimoUniversitario() {
		return emprestimoUniversitario;
	}

	public void setEmprestimoUniversitario(double emprestimoUniversitario) {
		this.emprestimoUniversitario = emprestimoUniversitario;
	} 
	
	
}