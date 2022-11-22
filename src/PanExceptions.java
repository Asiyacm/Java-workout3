import java.util.Scanner;
public class PanExceptions{
    static class InvalidPanException extends Exception {


        InvalidPanException(String msg) {
            super(msg);
        }
    }


    public static void main(String[] args) {
        Scanner xy = new Scanner(System.in);
        System.out.println("Enter the PAN Holder Name:");
        String s1 = xy.nextLine();
        System.out.println("PAN Holder Name is:" + s1);
        int index1 = s1.charAt(0);
        System.out.println("The character of name at position 0 is " + (char) index1);
        System.out.println("Enter the PAN Number:");
        String s2 = xy.nextLine();
        int index2 = s2.charAt(5);
        System.out.println("The character of pan at position 5 is " + (char) index2);
        try {
            if (s2.matches("[A-Z]{6}[0-9]{5}[A-Z]{2}") && (index1 == index2)) {
                throw new InvalidPanException("Valid PAN Number");
            } else if (s2.matches("[A-Z]{6}[0-9]{5}[A-Z]{2}") && (index1 != index2))
                throw new InvalidPanException("Invalid PAN Number");
        } catch (
                InvalidPanException e2) {
            System.out.println(e2.getMessage());
        }
    }
}

