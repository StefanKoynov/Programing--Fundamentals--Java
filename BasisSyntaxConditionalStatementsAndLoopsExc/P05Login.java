package BasisSyntaxConditionalStatementsAndLoopsExc;

import java.util.Scanner;

public class P05Login {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";
        for (int position = username.length() - 1; position >= 0; position--) {
            char currentSymbol = username.charAt(position);
            password += currentSymbol;
        }

        String currentPass = scanner.nextLine();
        int countPass = 0;
        while (!password.equals(currentPass)) {

            System.out.println("Incorrect password. Try again.");
            countPass++;

            if (countPass >= 3) {
                System.out.printf("User %s blocked!", username);
                break;
            }

            currentPass = scanner.nextLine();
        }
        if (password.equals(currentPass)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
