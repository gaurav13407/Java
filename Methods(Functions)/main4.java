import java.util.Scanner;

public class main4 {

    public static int add(int num1,int num2){
        int result=num1+num2;
        return result;

    }
    public static int subrtact(int num1,int num2){
        return num1-num2;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=scanner.nextInt();
        System.out.println("Enter second number:");
        int num2=scanner.nextInt();
        System.out.println("The result is:"+add(num1, num2));
        subrtact(num1, num2);
        System.out.println("The result of subtracting is:"+subrtact(num1, num2));
        scanner.close();

    }
}
