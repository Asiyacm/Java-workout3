package sportsstar;
import java.util.Scanner;

public class cricketer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cricket Player name: ");
        String ab = sc.nextLine();
        System.out.print("Enter  Cricket Player ID: ");
        String cd = sc.nextLine();
        System.out.print("Enter cricketer total run: ");
        int ef = sc.nextInt();
        System.out.print("Enter number of match played by cricketer: ");
        int gh = sc.nextInt();

        System.out.print("\nCricket Player name is : " + ab);

        System.out.print("\nCricket Player ID is : " + cd);
        System.out.print("\nCricketer total run is : " + ef);
        System.out.print("\nNumber of match played by cricketer is: " + gh);

        float avg = ef/gh;

        if (avg > 80) {
            System.out.println("\nHe is a grade A player and his income is 1500000");
        } else if (avg > 50 && avg <=80) {
            System.out.println("\nHe is a grade B player and his income is 950000");
        } else {
            System.out.println("\nHe is a grade C player and his income is 50000");
        }
    }
}

