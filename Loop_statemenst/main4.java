import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("PLease Enter a Number:");
        int userInput=-1;
        while(userInput!=0){
            System.out.println("Please Enter a Number 0 to stop");
            userInput=scanner.nextInt();
            System.out.println("You enterd:"+userInput);
        }
        scanner.close();
    }    
}
