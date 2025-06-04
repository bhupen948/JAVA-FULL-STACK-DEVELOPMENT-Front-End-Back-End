import java.util.Scanner;

class Test2 {
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        int x;
        System.out.println("enter any number: ");
        x = so.nextInt();
        Mac m = new Mac();
        System.out.println("You hava entered " + m.saysomething(x));
        so.close();
    }

    
}
class Mac {
    public int saysomething (int x) {
        return x;
    }

}