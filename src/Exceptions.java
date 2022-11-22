import java.util.Scanner;
public class Exceptions {
    static class exceptionLineTooShort extends Exception {

        exceptionLineTooShort(String msg) {
            super(msg);
        }
    }

    static class exceptionLineTooLong extends Exception {
        exceptionLineTooLong(String msg) {
            super(msg);
        }
    }

    public static int length(String input) {
        int i, l = 0;
        for (char c : input.toCharArray()) {
            l++;
        }
        return l;
    }

    public static void main(String[] args) {
        System.out.println("Enter the input");
        Scanner xy = new Scanner(System.in);
        String input = xy.nextLine();
        System.out.println("Length is:" + length(input));

        try {
            if (length(input) < 5) {
                throw new exceptionLineTooShort("The input is too short");
            } else if (length(input) > 10) {
                throw new exceptionLineTooLong("The input is too long");
            }
        } catch (exceptionLineTooShort e) {
            System.out.println(e.getMessage());
        } catch (exceptionLineTooLong e1) {
            System.out.println(e1.getMessage());
        }
    }
}