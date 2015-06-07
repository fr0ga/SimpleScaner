import java.util.Scanner;

/**
 * Created by fr0ga on 07.06.2015.
 */
public class SimpleScaner {

    public static String getString() {
        Scanner input = new Scanner(System.in);
        String inputString = input.next();
        return inputString;
    }


    public static void main(String[] args) {
        System.out.println("Test");
        String str = "";
        str = getString();
        System.out.println(str);

        while (!str.equals("quit")) {
            str = getString();
            System.out.println(str);
        }

    }
}
