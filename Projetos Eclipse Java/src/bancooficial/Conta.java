package bancooficial;
public abstract class Conta 
{
	
	//ATRIBUTOS
	protected int numeroConta; //tem
	protected double saldo; //tem
	protected String cpf; //tem
	
	
	//CONSTRUTORES - REGRA DE CRIA��O DA CLASSE
	//PEDREIRO E PE�O DE OBRA
	
	/*
	public Conta() //CONSTRUTOR PADR�O - B�SICO - MINIMO //CONSTRUTOR TEM O MESMO NOME DA CLASSE
	{
		
	}
	*/
	
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
	
	
	//ENCAPSULAMENTO
	public int getNumeroConta() {
		return numeroConta;
	}

	
	public double getSaldo() {
		return saldo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
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
	
	
	public void pixDebito(double valorDebitoPix )
	{
		this.saldo = this.saldo - valorDebitoPix;
	}
	
	public void pixCredito(double valorCreditoPix )
	{
		this.saldo = this.saldo - valorCreditoPix;
	}
	
	public void trocarNumero(int novoNumero) {
		this.numeroConta = novoNumero;
	}
	
}