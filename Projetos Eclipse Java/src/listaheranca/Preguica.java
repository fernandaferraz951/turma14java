package listaheranca;

public class Preguica extends Animal {
	
		public Preguica(String nome, int idade) {
			super(nome, idade);
		}

		public String subirArvore() {
			return "Pregui�a andando na arvore";
		}

		@Override
		public String fazerSom() {
			return "pshi pshi pshi";
		}
	}


