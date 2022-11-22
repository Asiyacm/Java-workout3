import java.util.Scanner;
public class Array {

    public static void Search(int ab[], int n) throws Exception
    {
        int s = 0;
        for(int i = 0; i< ab.length; i++) {
            if (ab[i] == n) {

                s = 1;
                break;
            }
        }
        if(s==1)
        {
            System.out.println("FOUND");
        }
        else
        {
            System.out.println("NOT FOUND");
        }
    }
    public static void Sort(int ab[]) throws Exception

    {
        int z;
        for(int i = 0; i< ab.length; i++)
        {
            for(int j = i+1; j< ab.length; j++)
            {
                if(ab[i] > ab[j])
                {
                    z = ab[i];
                    ab[i] = ab[j];
                    ab[j] = z;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter array size");
        Scanner xy = new Scanner(System.in);
        int s1 = xy.nextInt();
        int[] ab = new int[s1];
        System.out.println("Enter\t"+s1+ "\telements");
        for(int i = 0; i< ab.length; i++) {
            ab[i] = xy.nextInt();
        }
        System.out.println("Enter searching element");
        int n = xy.nextInt();
        try
        {
            Search(ab,n);
            Sort(ab);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Sorted array is :");
        for(int i = 0; i< ab.length; i++)
        {
            System.out.println(ab[i] +" ");
        }

    }
}



