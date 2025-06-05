import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner so=new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter 1st Value:");
        x=so.nextInt();
        System.out.println("Enter 2nd Value:");
        y=so.nextInt();
        System.out.println("Enter yourchoice:\n1.Add\n2.subs\n3.Multi\n4.Div");
        z=so.nextInt();
        if (z==1) {
        System.out.println("Sum is : "+(x+y));

       }
       else if (z==2) {
        System.out.println("Subs is:"+ (x-y));
        
       }
       else if(z==3)
       {
        System.out.println("Multi is:"+(x*y));
       }
       else if (z==4) 
       {
        System.out.println("Div is:"+(x/y));
        
       }
       else

       {
        System.out.println("invalid choice..");
       }
    }

    
}