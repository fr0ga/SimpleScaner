import java.util.Scanner;

/**
 * Created by fr0ga on 07.06.2015.
 */
public class SimpleScaner {

    static String input = "";

    public static String getString() {
        Scanner input = new Scanner(System.in);
        String inputString = input.next();
        return inputString;
    }


    public static void main(String[] args) {


        while (!input.equals("quit")) {
            input = getString();
            System.out.println(input);
        }

    }
}
