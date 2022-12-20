package BasisSyntaxConditionalStatementsAndLoopsExc;

import java.util.Scanner;

public class P03Vacation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double currentPrice = 0;
        double totalPrice = 0;
        if (day.equals("Friday")) {
            if (typeOfGroup.equals("Students")) {
                currentPrice = 8.45;
            } else if (typeOfGroup.equals("Business")) {
                currentPrice = 10.90;
            } else if (typeOfGroup.equals("Regular")) {
                currentPrice = 15;
            }
        }
        if (day.equals("Saturday")) {
            if (typeOfGroup.equals("Students")) {
                currentPrice = 9.80;
            } else if (typeOfGroup.equals("Business")) {
                currentPrice = 15.60;
            } else if (typeOfGroup.equals("Regular")) {
                currentPrice = 20;
            }
        }
        if (day.equals("Sunday")) {
            if (typeOfGroup.equals("Students")) {
                currentPrice = 10.46;
            } else if (typeOfGroup.equals("Business")) {
                currentPrice = 16;
            } else if (typeOfGroup.equals("Regular")) {
                currentPrice = 22.50;
            }
        }
        totalPrice = numberOfPeople * currentPrice;

        if (typeOfGroup.equals("Students") && numberOfPeople >= 30) {
            totalPrice = totalPrice - (totalPrice * 0.15);
        }

        if (typeOfGroup.equals("Business") && numberOfPeople >= 100) {
            totalPrice = totalPrice - (currentPrice * 10);
        }

        if (typeOfGroup.equals("Regular") && numberOfPeople >= 10 && numberOfPeople <= 20) {
            totalPrice = totalPrice - (totalPrice * 0.5);
        }

        System.out.printf("Total price: %.2f%n", totalPrice);
    }
}


