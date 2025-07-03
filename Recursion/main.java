import java.util.Scanner;
public class main {

    public static int factorial(int n){
        if(n==0){
            return 1; // base case
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("ENter the number n:");
        int n=scanner.nextInt();
        System.out.println("The factorial of number "+ n +" is :"+factorial(n));
        scanner.close();
        
    }    
}
