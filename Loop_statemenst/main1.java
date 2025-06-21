import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("ENter the levels:");
        int levels=scanner.nextInt();

        //bulding the pyramid
        for(int i=0;i<=levels;i++){
            //printing leading space
            for(int j=0;j<levels-i;j++){
                System.out.print(" ");
            }
            //Print Star
            for(int k=0;k<2*i-1;k++){
                System.out.print("*");
            }
            //Move to next line
            System.out.println();
        }
        //close scanner
        scanner.close();
    }    
}
