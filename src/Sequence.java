import java.util.*;
public class Sequence {

    public static void main(String[] args) {
        System.out.println("Enter input");
        Scanner xy = new Scanner(System.in);
        String s1 = xy.nextLine();
        System.out.println("The input is:" + s1);
        s1 = s1.toLowerCase();
        int VowelCount = 0;
        int WordCount = 1;
        String[] line = xy.delimiter().split("\\n+");
        System.out.println("Number of lines :" +line.length);
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u') {
                VowelCount++;
            }
        }
        System.out.println("Vowel Count is :" + VowelCount);
        for (int j = 0; j < s1.length() - 1; j++) {
            if ((s1.charAt(j) == ' ') && (s1.charAt(j + 1) != ' ')) {
                WordCount++;
            }
        }
        System.out.println("Word Count is :" + WordCount);

    }

}
