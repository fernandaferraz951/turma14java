package lista5;
import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double peso, altura;
		System.out.println("Digite sua altura em centímetros (Ex: 180): ");
		altura = leia.nextDouble();
		System.out.println("Digite seu peso em quilogramas (Ex: 85.5): ");
		peso = leia.nextDouble();
		System.out.println(calculoIMC(peso, altura/100));
		leia.close();
	}

	static String calculoIMC(double m, double h) {
		double R;
		R = (m / Math.pow(h, 2.0));
		if (R < 18.5) {
			return ("Você está abaixo do peso (" + Math.round(R * 100.0) / 100.0 + ")");
		} else if (R >= 18.5 && R < 25) {
			return ("Você está no seu peso normal (" + Math.round(R * 100.0) / 100.0 + ")");
		} else if (R >= 25 && R < 30) {
			return ("Você está acima do peso (" + Math.round(R * 100.0) / 100.0 + ")");
		} else {
			return ("Você está obeso (" + Math.round(R * 100.0) / 100.0 + ")");
		}
	}

}
