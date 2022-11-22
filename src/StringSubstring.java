import java.util.Scanner;

class StringSubstring{
    public static void main(String args[])
    {
        String Input,Substrings;
        int i, j,length;

        Scanner xy = new Scanner(System.in);
        System.out.println("Enter a string");
        Input = xy.nextLine();
        length = Input.length();
        System.out.println("Substrings of \""+Input+"\" is:");
        for (j=0;j< length;j++)
        {
            for(i= 1;i<= length-j;i++)
            {
                Substrings = Input.substring(j,j+i);
                System.out.println(Substrings);
            }
        }
    }
}

