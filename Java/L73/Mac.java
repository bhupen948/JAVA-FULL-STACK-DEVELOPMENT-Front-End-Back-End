import java.util.Scanner;

class Mac
{ 
    public static void main(String args[])
    {
        Scanner so = new Scanner(System.in);
        String input;
        int decimal;

        System.out.println("Enter a number in octal format (base 8):");
        input = so.next();  // Get the input as a string

        try {
            decimal = Integer.parseInt(input, 8);  // Convert from base 8 to decimal
            System.out.println("Decimal: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid octal number!");
        }

        so.close(); // Always close the scanner
    }
}
