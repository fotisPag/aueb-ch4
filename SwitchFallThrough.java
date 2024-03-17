package gr.aueb.cf.ch4;

import java.util.Scanner;

/*
* Λαμβάνει ένα αριθμό που συμβολίζει βαθμό  από τον χρήστη
* και εμφανίζει κατάλληλο μήνυμα
*
* author fotisPag
* */
public class SwitchFallThrough {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int choice;


        while (true) {

        System.out.println("Παρακαλώ δώστε τον βαθμό ή πατήστε -1 για έξοδο");
        choice = in.nextInt();

        if (choice == -1){
            System.out.println("Αντίο");
            break;

        }

            switch (choice) {

                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Κάτω από τη βάση");
                    break;
                case 5:
                case 6:
                    System.out.println("Καλώς");
                    break;
                case 7:
                case 8:
                    System.out.println("Λείαν καλώς");
                    break;
                case 9:
                case 10:
                    System.out.println("Άριστα");
                    break;
                default:
                    System.out.println("Παρακαλώ δώστε αριθμό από το 1 - 10");
                    break;

            }

        }
    }


}
