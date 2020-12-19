package ecomerce;
import java.util.Scanner;
public class Cliente extends Pessoa {
	private static String cpf;
	
	public static String getCpf() {
		return cpf;
	}
	
	public static void setCpf(String cpf) {
		
	}
	

	public Cliente(String nome, char genero, int anoNascimento, String cpf) {
		super(nome, genero, anoNascimento);
		Cliente.cpf=cpf;
	}
	
	
	static String corrigeCPF (String novoCPF) {
	Scanner leia=new Scanner (System.in);
	String CPF ="A";
	System.out.print("Insira um novo CPF: ");
	novoCPF = leia.next();
	if (novoCPF != null) {
		CPF= novoCPF;
		
	} else {
		System.out.println("CPF invalido");
		
	}
	return CPF;
	
	
	
	

	
}	

}
