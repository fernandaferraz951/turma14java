package lista3;

public class exercicio2Lista3 {

	public static void main(String[] args) {
        int num ;
        int soma = 0;

        for (num = 1; num <= 500; num++) {
            if ((num % 2 == 1) && (num % 3 == 0)) {
                soma = soma + num;
            }
        }

        System.out.println(soma);
    }

}
