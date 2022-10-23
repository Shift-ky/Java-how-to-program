package exercices.chapter_1;

/**
 * @Shift-ky
 * 
 * Write an application that asks the user to enter two integers, obtains them
 * from the user and prints their sum, product, difference and quotient (division). Use the techniques
 * shown in Fig. 2.7.
 */

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        int number1;
        int number2;
        int sum;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        number2 = input.nextInt();
        sum = number1 + number2;

        System.out.printf("The sum is %d",sum);
        System.out.printf("\nThe product is %d",number1*number2);
        System.out.printf("\nThe diference beetwen is %d",number1 - number2);
        System.out.printf("\nThe quociente is %d10",number1/number2);

        input.close();
    }
    
}
