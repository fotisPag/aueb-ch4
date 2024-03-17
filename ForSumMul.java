package gr.aueb.cf.ch4;


/*
*
* Υπολογίζει το άθροισμα και το γινόμενο
* των 10 πρώτων αριθμών
*
* @author fotisPag
* */


public class ForSumMul {

    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση
        int sum = 0;
        int mu1 = 1;

        //Δομή Ελέγχου for
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }

        for (int i = 1; i <= 10; i++) {
            mu1 = mu1 * i;
        }

        System.out.println("Το αποτέλεσμα του αθροίσματος: " + sum);
        System.out.println("Το αποτέλεσμα του γινομένου: " + mu1);

    }

}
