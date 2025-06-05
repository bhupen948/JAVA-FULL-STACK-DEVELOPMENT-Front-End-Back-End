import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        char ch;
        System.out.println("Enter any alphabet:");
        ch = so.next().charAt(0);
        switch (ch)
        {
            case'a':
            System.out.println(ch+"is a vowe.");
            break;
            case'e':
            System.out.println(ch+"is avowel.");
            break;
            case'i':
            System.out.println(ch+"is a vowel.");
            break;
            case'o':
            System.out.println(ch+"is a voel.");
            break;
            case'u':
            System.out.println(ch+"is a vowel.");
            break;
            default:
            System.out.println(ch+"is its not a voel.");
            break;

        }


    }
}
