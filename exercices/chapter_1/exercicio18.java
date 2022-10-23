package exercices.chapter_1;

import java.util.Scanner;

/**
 * @author
 * 
 * Write an application that displays a box, an oval, an arrow
 * and a diamond using asterisks (*)
 */
public class exercicio18{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("*******************       ***          *         *");
        System.out.println("*                 *     *     *       ***       * *     ");
        System.out.println("*                 *    *       *     *****     *   *    ");
        System.out.println("*                 *    *       *       *      *     *   ");
        System.out.println("*                 *    *       *       *     *       *  ");
        System.out.println("*                 *    *       *       *      *     *   ");
        System.out.println("*                 *    *       *       *       *   *   ");
        System.out.println("*                 *     *     *        *        * *    ");
        System.out.println("*******************       ***          *         *      ");



        input.close();
    }
}