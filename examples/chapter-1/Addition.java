
import java.util.Scanner;

public class Addition 
{
	//método main inicia a execução do aplicativo java
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// criar um Scanner para obter a entrada da janela de comando
		
		Scanner input = new Scanner(System.in);
		
		int number1;  //primeiro número a somar
		int number2; //Segundo número a somar
		int sum; // soma do number1 e number2;
		
		System.out.print("Enter first interger: ");  //prompt
		number1 = input.nextInt(); //lê o primeiro número fornecido pelo usuário
		
		System.out.print("Enter second interger: "); //prompt
		number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário
		sum = number1 + number2;
		
		System.out.printf("Sum is %d%n", sum); // exibe a soma,

		input.close();
	
	}//fim metodo main
}// fim metodo Addition
