package exercices.chapter_1;

import java.util.Scanner;

/**
 * @author @Shift-ky
 * 
 * Write an application that inputs three integers from the
 * user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
 * shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
 * representation of the average. So, if the sum of the values is 7, the average should be 2, not
 * 2.3333….]
 */

public class exercicio17 {

   /**
 * @param args
 */
public static void main(String[] args) {
        int number1;
        int number2;
        int number3;
        int larger = 0;
        int smallest = 999;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer");
        number2 = input.nextInt();

        System.out.print("Enter thirt integer: ");
        number3 = input.nextInt();

        if(number1 > number2 && number1 > number3)
            larger = number1;
        if(number2 > number1 && number2 > number3)
            larger = number2;
        if(number3 > number1 && number3 > number2)
            larger = number3;

        if(number1 < number2 && number1 < number3)
            smallest = number1;
        if(number2 < number1 && number2 < number3)
            smallest = number2;
        if(number3 < number1 && number3 < number2)
            smallest = number3;
        
        System.out.printf("\nthe sum is: %d",number1+number2+number3);
        System.out.printf("\nthe average is: %d",(number1+number2+number3)/3);
        System.out.printf("\nThe product is %d",number1*number2*number3);
        System.out.printf("\nThe larges number is %d",larger);
        System.out.printf("\nThe smallest number is %d",smallest);
        

        input.close();
   } 
    
}
