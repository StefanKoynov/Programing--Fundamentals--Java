package BasisSyntaxConditionalStatementsAndLoopsExc;

import java.util.Scanner;

public class P04PrintandSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        int finalSum = 0;
        for (int i = numberOne; i <= numberTwo ; i++) {
            finalSum = finalSum + i;
            System.out.printf("%d " , i);

        }
        System.out.println();
        System.out.println("Sum: " + finalSum);
    }
}
