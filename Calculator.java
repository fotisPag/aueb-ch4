package gr.aueb.cf.ch4;

import java.util.Scanner;

/*
* Υλοποιεί ένα απλό υπολογιστή τσέπης που κάνει
* πρόσθεση, αφαίρεση, πολλαπλασιασμό, διαίρεση και mod.
*
*
* @author fotisPag
* */

public class Calculator {
    public static void main(String[] args) throws java.io.IOException {
        //δήλωση και αρχικοποίηση
        Scanner in = new Scanner(System.in);
        int num1, num2, result;
        char ch;

        System.out.println("Παρακαλώ δώστε μια αριθμητική πράξη" +
                "και δώστε Enter μετά από κάθε αριθμό και μετά το" +
                "σύμβολο της πράξης");

        num1 = in.nextInt();
        ch = (char) System.in.read();
        num2 = in.nextInt();

        //switch
        switch (ch) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 * num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                result = -1;
                System.out.println("Λάθος πράξη");
                break;

        }
        System.out.println("Το αποτέλεσμα της πράξης είναι: " + result);

    }

}
