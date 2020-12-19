package Objetos;

public class Produto {
	
	public String nomeProduto;
	public int qtdeProduto;
	public  double valorUnitario;
	public String codigo;
	
	public Produto (String codigo, String produto, double preco, int quantidade) {
		
	}

	public Produto(String nomeProduto, int qtdeProduto, double valorUnitario, String codigo) {
		super();
		this.nomeProduto = nomeProduto;
		this.qtdeProduto = qtdeProduto;
		this.valorUnitario = valorUnitario;
		this.codigo = codigo;
	}
	
	public Produto(String codigo) {
		super();
		this.codigo = codigo;
	}
	
	public Produto(String codigo, double preco) {
		super();
		this.codigo = codigo;
		this.valorUnitario = valorUnitario;
	}
	
	

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQtdeProduto() {
		return qtdeProduto;
	}

	public void setQtdeProduto(int qtdeProduto) {
		this.qtdeProduto = qtdeProduto;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public double comprarProduto(int quantidade) {
		if (quantidade <= this.qtdeProduto) {
			tiraEstoque(quantidade);
			return this.valorUnitario*quantidade;
		} else {
			System.out.println("Infelzimente não possuimos essa quantidade em estoque. Quantidade atual" + this.qtdeProduto);
		} return 0;
	}
	
	private void tiraEstoque(int quantidade) {
		qtdeProduto-=quantidade;
	}
	
	private void adicionaEstoque(int quantidade) {
		qtdeProduto+=quantidade;
		
	}
	
	
}

	
	


