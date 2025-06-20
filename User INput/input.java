import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your Age:");
        int age=scanner.nextInt(); // Read an integer input
        scanner.nextLine(); // Consume the newline character left by nextInt()
        System.out.print("Enter your name: ");
        String name=scanner.nextLine(); // Consume the newline character left by nextInt()
        System.out.println("Your Name is: " + name + "!");
        scanner.close();
    }

}
