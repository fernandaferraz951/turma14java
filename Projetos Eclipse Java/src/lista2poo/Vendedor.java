package lista2poo;

public class Vendedor extends Pessoa {
	
	private double valorVendas;
	private double comiss�o; 
	
	public double  salarioVendedor(){
		double salario=this.valorVendas+this.comiss�o;
		return salario; 
	}

	

	public Vendedor(String nome, String endereco, String telefone, double valorVendas, double comiss�o) {
		super(nome, endereco, telefone);
		this.valorVendas = valorVendas;
		this.comiss�o = comiss�o;
	}
	
	
	

}
