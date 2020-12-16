package lista2poo;

public class Vendedor extends Pessoa {
	
	private double valorVendas;
	private double comissão; 
	
	public double  salarioVendedor(){
		double salario=this.valorVendas+this.comissão;
		return salario; 
	}

	

	public Vendedor(String nome, String endereco, String telefone, double valorVendas, double comissão) {
		super(nome, endereco, telefone);
		this.valorVendas = valorVendas;
		this.comissão = comissão;
	}
	
	
	

}
