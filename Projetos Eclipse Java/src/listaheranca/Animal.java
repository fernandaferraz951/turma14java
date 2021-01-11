package listaheranca;

public abstract class Animal {
	private String nome;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String fazerSom() {
		return "";
	}

	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
}