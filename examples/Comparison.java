
//Compare intergers using if statements, relational operators
//and equality operators
import java.util.Scanner; //Program uses class Scanner

public class Comparison {

    //main method begins execution of java application
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        //create Scanner to obtain input from command line
        Scanner input = new Scanner(System.in);

        int number1; // firt number to compare
        int number2; // second number to compare

        System.out.print("Enter firt integer: "); //prompt
        number1 = input.nextInt(); //read firt number from user
       
        System.out.print("Enter second integer: "); //prompt
        number2 = input.nextInt(); //read second number from user

        if(number1 == number2)
            System.out.printf("%d == %d%n",number1, number2);

        if(number1 != number2)
            System.out.printf("%d != %d%n",number1, number2);

        if(number1 < number2)
            System.out.printf("%d < %d%n",number1, number2);

        if(number1 > number2)
        System.out.printf("%d > %d%n",number1, number2);

        if(number1 <= number2)
           System.out.printf("%d <= %d%n",number1, number2);

        if(number1 >= number2)
           System.out.printf("%d >= %d%n",number1, number2);

        input.close(); // clossed of object   
    } // end method main
} // end class comparison