
import java.util.Scanner;

public class MyClass{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //boolean isSunny=true;
        //int a=5;
        String name=scanner.nextLine();
        if(name.equals("Denis")){
            System.out.println("Hi Denis");
        }
        System.out.println("Outside of any condition");
    }
}