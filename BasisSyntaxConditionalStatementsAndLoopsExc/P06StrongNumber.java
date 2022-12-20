package BasisSyntaxConditionalStatementsAndLoopsExc;

import java.util.Scanner;

public class P06StrongNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number; // първоначално въведената стойност на числото

        int sumFact = 0;

        while (number > 0) {
            int lastDigits = number % 10;

            int fact = 1;
            for (int i = 1; i <= lastDigits; i++) {
                fact = fact * i;
            }
            sumFact += fact;
            number = number / 10; // Премахваме последната цифра


        }
        if (sumFact == startNumber){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
