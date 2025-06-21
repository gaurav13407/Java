import java.util.Scanner;

public class harshad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInputNum;
        System.out.println("Please Enter a number:");
        userInputNum=scanner.nextInt();

        int original=userInputNum;
        int sum=0;
        while(userInputNum>0){
            sum+=userInputNum%10;
            userInputNum/=10;
        }
        if(original%sum==0){
            System.out.println("The Number is a Harshad Number");
        }
        else{
            System.out.println("This is not an harshad number");
        }
    }    
}
