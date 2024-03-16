package gr.aueb.cf.ch4;

import java.util.Scanner;
/*
* Θα υλοποιήσουμε ένα απλό υπολογιστή
τσέπης που κάνει πρόσθεση, αφαίρεση,
πολλαπλασιασμό, διαίρεση και mod
(υπόλοιπο)
• Θα δίνει ο χρήστης την πράξη, π.χ. 2 + 5
ή 12 / 4 ή 89 % 5 και ο υπολογιστής
ανάλογα με το σύμβολο της πράξης θα
κάνει τον αντίστοιχο υπολογισμό και θα
εμφανίζει το αποτέλεσμα
*
*
*
* */

public class CalculatorApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        int choice = 0;
        char operator = ' ';
        boolean isError = false;

        System.out.println("Please insert an int, an operator and a second int");
        num1 = in.nextInt();
        operator = in.next().charAt(0);
        num2 = in.nextInt();


        switch (operator) {

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
                if (num2 !=0){
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Error in operator");
                isError = true;
                break;

        }
        if (!isError)
            System.out.printf("%d %c %d = %d", num1, operator, num2, result);
    }

}
