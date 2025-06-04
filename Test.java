import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        int x;
        System.out.println("enter any number:");
        x = so.nextInt();
        Mac m = new Mac();
        int s = m.saysomething(x);
        System.out.println("you have entered"+s);
        so.close();
    }
    

    
}

class Mac {
    public int saysomething (int x){
        return x;
    }
}
