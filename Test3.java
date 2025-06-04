
import java.util.Scanner;

class Test3 {
    
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        int x, y;
        System.out.println("enter 1st number: ");
        x = so.nextInt();
        System.out.println("enter 2nd number: ");
        y = so.nextInt();
        Mac m = new Mac();
        System.out.println("Sum is " + m.sum(x, y));
        so.close();
    }
}

class Mac {
    public int sum(int x, int y) {
        return x + y;
    }
    
}
