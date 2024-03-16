package gr.aueb.cf.ch4;

import java.io.IOException;

/*
* Char input with System.in.read();
* */


public class CharInputApp {

    public static void main(String[] args) throws IOException {

        int inputChar = ' '; //' ' returns the ordinal value of the char

        System.out.println("Please insert adn ASCII char");
        inputChar = System.in.read(); //reads one bye as int

        System.out.println("char: " + (char) inputChar);

    }

}
