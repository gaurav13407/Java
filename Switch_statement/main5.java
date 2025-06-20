import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a or b:");
        String choice =scanner.nextLine();

        switch (choice) {
            case "a":
                System.out.println("Now choose 1or2:");
                String choice2=scanner.nextLine();
                switch (choice2) {
                    case "1":
                        System.out.println("Thanks for chossing 1,good choice");
                        break;
                    case "2":
                        System.out.println("Thanks for chossing 2 Bad choice");
                        break;
                    default:
                    System.out.println("Wrong Choice");
                        break;
                }
                break;
            case "b":
                System.out.println("thanks for chossing b now exit the code");
            break;
            default:
            System.out.println("Wrong Choice");
                break;
        }
        scanner.close();
    }    
}
