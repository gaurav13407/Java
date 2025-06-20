import java.util.Scanner;

public class number_input {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //System.out.print("Enter your name: ");
        //String name=scanner.nextLine(); // Consume the newline character left by nextInt()

        System.out.print("Enter your a: ");
        int a = scanner.nextInt(); // Read an integer input

        System.out.print("Enter your b: ");
        int b = scanner.nextInt(); // Read another integer input

        int sum=a+b;

        System.out.println("Result of adding two number is: " +sum);
        scanner.close();
    }

}
