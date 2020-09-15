package chapter2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MadLibs2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ask for an adjective + season
        System.out.println("Enter an adj and a season ");
        String adj = scanner.nextLine();

        //asking for a whole number + adjective
        System.out.println("Enter a whole number with an adj ");
        String wholeNumberAdj = scanner.nextLine();

        //display
        System.out.println("On a " + adj + " day, I drink a minimum of " + wholeNumberAdj +" cups of coffee.");

    }
}
