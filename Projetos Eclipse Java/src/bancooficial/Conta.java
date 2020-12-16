package bancooficial;
public abstract class Conta
{
	
	//ATRIBUTOS
	public int numeroConta;//tem
	public double saldo;//tem
	public String cpf;//tem
	public boolean ativa; //é
	
	//CONSTRUTORES - REGRA DE CRIAÇÃO DA CLASSE
	//PEDREIRO E PEÃO DE OBRA
	
	public Conta() //CONSTRUTOR PADRÃO - BÁSICO - MINIMO //CONSTRUTOR TEM O MESMO NOME DA CLASSE
	{
		
	}
	
	// *SOBRECARGA //A MESMA COISA DE UM JEITO DIFERENTE
	public Conta(int numeroConta)
	{
		this.numeroConta = numeroConta;
	}
	//*SOBRECARGA
	public Conta(int numeroConta, String cpf)
	{
		this.numeroConta = numeroConta;
		this.cpf = cpf;
	}
	
	
	//METODOS
	public void debito(double valorDebito)
	{
		this.saldo = this.saldo - valorDebito;
		
	}
	
	public void credito (double valorCredito)
	{
		this.saldo = this.saldo + valorCredito;
	}
	
	
}
