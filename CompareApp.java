package gr.aueb.cf.ch4;

/**
 *
 * Char collation/sorting is based on code points/
 * That is comparison between char is based on the original numbers (code points)
 * according to UCS-2 (UTF-16), UCS-2 includes ASCII characters as well as
 * Greek characters in two-byte sequence (bit patterns)
 *
 */




public class CompareApp {

    public static void main(String[] args) {

        char a = 'α';
        char b = 'b';
        boolean greekIsGreater = false;

        System.out.println((int) a);
        System.out.println((int) b);

        if (a > b) greekIsGreater = true;

        System.out.println("Greek is greater: " + greekIsGreater);

    }

}
