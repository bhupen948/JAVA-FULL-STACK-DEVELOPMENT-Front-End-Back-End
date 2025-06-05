import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        int n,r, rev = 0;
        System.out.println("Enter any digit:");
        n = so.nextInt();
        int x=n;

        while (n!= 0) 
        {
            r = n % 10;
            rev = (rev * 10)+r;
            n = n/10;


        }
        System.out.println("Reverse is: "+ rev);
        if (x==rev)
        {
            System.out.println("Give number is palindrome number : ");
        }
        else
        {
            System.out.println("Given number is not palindrom number:");
        }

    }

    
}