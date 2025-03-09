package gabriela;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe seu peso: ");
		int peso = teclado.nextInt();
		
		System.out.print("Agora, informe sua altura: ");
		double altura = teclado.nextDouble();
		
		double imc = peso/(altura*altura);
		
		System.out.printf("O IMC resultante é: %.2f", imc);
		
	}

}
