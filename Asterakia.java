package gr.aueb.cf.ch4;

import java.util.Scanner;

public class Asterakia {

    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        int a = 0, b = 0;
//
//        System.out.println("Δώσε τον αριθμό της σειράς");
//        a = in.nextInt();

//εμφανίζει 10 αστεράκια οριζόνται και κάθετα
//        for(int i = 1; i <= 10; i++){
////            System.out.println("*");
//            for(int j = 1; j <= 10; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //εμφανίζει αστεράκια από το 1 μέχρι το 10
//        for(int i = 1; i <= 10; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //εμφανίζει αστεράκια από το 10 μέχρι το 1
        for(int i = 10; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
