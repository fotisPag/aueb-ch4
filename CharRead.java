package gr.aueb.cf.ch4;

import java.io.IOException;

/*
* Διαβάζει χαρακτήρα χαρακτήρα μέχρι να βρεί !
*
* @fotisPag
* */


public class CharRead {

    public static void main(String[] args) throws IOException {
        char ch;

        do {
            System.out.println("Παρακαλώ δώστε ένα χαρακτήρα");
            ch = (char) System.in.read();
            System.in.skip(2);//Κάνουμε skip τους δύο αριθμούς που δεν θέλω να διαβάσω


        } while (ch != '!');

        System.out.println("Αντίο");

    }

}
