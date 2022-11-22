package sportsstar;
import java.util.Scanner;

public class footballer{

    public static void main(String[] args) {
        Scanner xy = new Scanner(System.in);
        System.out.print("Enter Football Player name: ");
        String kl = xy.nextLine();
        System.out.print("Enter Football Player ID: ");
        String mn = xy.nextLine();
        System.out.print("Enter number of match of Football Player: ");
        float op = xy.nextFloat();
        System.out.print("Enter  Footballer total goal: ");
        float qr = xy.nextFloat();


        System.out.print("\nFootball Player name is : " + kl);

        System.out.print("\nFootball Player ID is : " + mn);
        System.out.print("\nNumber of match played by footballer is : " + op);
        System.out.print("\nFootballer total goal is : " + qr);

        float F_avg = qr/op;

        if (F_avg > 80) {
            System.out.println("\nHe is a grade A player and his income is 1650000");
        } else if (F_avg > 50 && F_avg <=80) {
            System.out.println("\nHe is a grade B player and his income is 920000");
        } else {
            System.out.println("\nHe is a grade C player and his income is 54000");
        }
    }
}
