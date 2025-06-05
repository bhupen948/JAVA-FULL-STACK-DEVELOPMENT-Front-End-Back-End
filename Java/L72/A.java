class A {
    public static void main(String args[]) {
        int a, b;
        b = 1;
        a = ++b + b++ + ++b;  // ++b = 2, +b = 2 → a = 4
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
