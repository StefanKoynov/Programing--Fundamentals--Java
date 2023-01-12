package BasisSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class PO1StudentInformation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double averageGrade = Double.parseDouble(scanner.nextLine());
        double gay = Double.parseDouble(scanner.nextLine());
        System.out.printf("Name: %s, Age: %d, Grade: %.2f" , name , age , averageGrade);
    }
}
