import java.util.Scanner;

class Mac {
   

    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        int rows;
        System.out.println("Enter the no. of rows; ");
        rows  = so.nextInt();
       
        for (int i=rows; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print(" *" +j);
            }
            System.out.println(" \n");
        }
    }
    
}