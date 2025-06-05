import java.util.Scanner;

class D {
    public static void main(String[] args) {
        Scanner so=new Scanner(System.in);
        char ch;
        System.out.println("Enter any alphabet:");
        ch=so.next().charAt(0);
        switch(ch)
        {
            case'a':case'e':case'i':case'o':case'u':
            System.out.println(ch+"is a voel.");
            break;
            default:
            System.out.println(ch+"is not a voel.");
            break;
        }
    }
    
}
