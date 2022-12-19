package BasisSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class P07TheatrePromotion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int ticketprice = 0;

        if (age >=0 && age <=18){
            if (day.equals("Weekday")){
                ticketprice = 12;
            } else if (day.equals("Weekend")){
                ticketprice = 15;
            } else if (day.equals("Holiday")){
                ticketprice = 5;
            }
        }
        if (age > 18 && age <= 64){
            if (day.equals("Weekday")){
                ticketprice = 18;
            } else if (day.equals("Weekend")){
                ticketprice = 20;
            } else if (day.equals("Holiday")){
                ticketprice = 12;
            }
        }
        if (age > 64 && age <= 122){
            if (day.equals("Weekday")){
                ticketprice = 12;
            } else if (day.equals("Weekend")){
                ticketprice = 15;
            } else if (day.equals("Holiday")){
                ticketprice = 10;
            }
        }
        if (age < 0 || age > 122){
            System.out.println("Error!");
        } else {
            System.out.println(ticketprice + "$");
        }

    }
}
