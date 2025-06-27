import java.util.Scanner;

public class main2 {
    public static void makeSandwich(int piece){
        System.out.println("Take Two slicese of bread");
        System.out.println("Spread butter on one silce");
        System.out.println("Add a "+ piece +" slice of chesse");
        System.out.println("Sandeich ready");
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the amount of chess you want on your sandwhich:");
        int peice=scanner.nextInt();
        makeSandwich(peice);
        scanner.close();
    }    
}
