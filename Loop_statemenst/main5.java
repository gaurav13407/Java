import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("PLease Enter a number 0 to exit");
            input=scanner.nextInt();
            System.out.println("Thanks for entering:"+input);
        }while(input!=0);
        scanner.close();
    }    
}
