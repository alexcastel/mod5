import java.util.Scanner;

public class factor {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		do {
			System.out.print("Introducir un numero (n>=0): ");
			numero = scanner.nextInt();
		} while (numero < 0);
		scanner.close();

		int fact = calculaFactorial(numero);	
		System.out.println("El factorial de "+numero+" es: "+fact);
	}

	public static int calculaFactorial(int n) {
			
		int resultado = 1;
		
		for(int i=2; i<=n; i++) 
			resultado=resultado*i;
		return resultado;
	}


}
