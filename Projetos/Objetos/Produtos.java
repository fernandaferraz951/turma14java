package Objetos;

public class Produtos {

    private String codigo;
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produtos(String codigo, String nome, double preco, int quantidadeEstoque) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Produtos(String codigo, int quatidadeEstoque, double preco) {
        super();
        this.codigo = codigo;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
    }

    public Produtos(String codigo) {
        super();
        this.codigo = codigo;
    }

    public Produtos(String codigo, double preco) {
        super();
        this.codigo = codigo;
        this.preco = preco;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public double comprarProduto(int quantidade) {
        if (quantidade <= this.quantidadeEstoque) {
            tiraEstoque(quantidade);
            return this.preco * quantidade;
        } else {
            System.out.println("NÃO TEMOS ESSA QUANTIDADE EM ESTOQUE. QTD ATUAL" + this.quantidadeEstoque);
            return 0;
        }

    }

    private void tiraEstoque(int quantidade) {
        quantidadeEstoque -= quantidade;
    }

    private void adicionaEstoque(int quantidade) {
        quantidadeEstoque += quantidade;
    }

}