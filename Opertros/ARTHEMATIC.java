import java.util.Scanner;

public class ARTHEMATIC {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //System.out.print("Enter your name: ");
        //String name=scanner.nextLine(); // Consume the newline character left by nextInt()

        System.out.print("Enter your a: ");
        int a = scanner.nextInt(); // Read an integer input

        System.out.print("Enter your b: ");
        int b = scanner.nextInt(); // Read another integer input

        int sum=a+b;
        int subtract= a-b;
        int multiply= a*b;
        int divide= a/b;
        int modulus= a%b;

        System.out.println("Result of adding two number is: " +sum);
        System.out.println("Result of subtracting two number is: " +subtract);
        System.out.println("Result of multiplying two number is: " +multiply);
        System.out.println("Result of dividing two number is: " +divide);
        System.out.println("Result of modulus two number is: " +modulus);
        scanner.close();
    }

}