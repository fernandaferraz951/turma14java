package lista2poo;

import java.util.Scanner;

public class pessoaProg {

	public static void main(String[] args) {

		        Scanner leia =new Scanner(System.in);


		        Fornecedor Jonas= new Fornecedor("Jonas","Rua Plinio","934552215");
		        Administrador Bolsonaro= new Administrador ("Bolsonaro", "rua do simba" , "40028922" , 200 );
		        Vendedor Josimar = new Vendedor ("Josimar Bilbo", "Rua top", "52454541", 200.00, 200.00  ); 

		        
		        Jonas.setValorCredito(100);
		        Jonas.setValorDivida(50);
		        
		        



		        System.out.println(Jonas.DiferencaSaldoCredito());
		        System.out.println ("O nome do administrador e : " + Bolsonaro.getNome() + " a Ajuda de custo é: " + Bolsonaro.getAjudaDecusto());
		        System.out.println("O nome do vendedor é: " + Josimar.getNome() + " O salário do vendedor é : "+ Josimar.salarioVendedor());






		    }

		}