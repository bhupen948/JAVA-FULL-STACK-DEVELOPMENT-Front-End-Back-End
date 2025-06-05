import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner so =new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter 1st Value：");
        x=so.nextInt();
        System.out.println("Enter 2nd Value: ");
        y=so.nextInt();
        System.out.println("Enter your choice:\n1.Add\n2.subs\n3.Multi\n4.Div");
        z=so.nextInt();
        switch (z) {
            case 1:
            System.out.println("sum is :"+(x+y));
                
                break;
            case 2:
            System.out.println("Subs:"+(x-y));
                break;
            case 3:
            System.out.println("Multi is:"+(x*y));
                break;
            case 4:
            System.out.println("Div is:"+(x/y));
                break;
                default:
                System.out.println("Invalid choice ..try later..");
                break;
        }

    }
    
}
