import java.util.Scanner;

public class Practice {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the Principle Amount:");
        double a=scanner.nextDouble();
        System.out.println("Enter the Annual Rate(In Percentage):");
        double r=scanner.nextDouble();
        System.out.println("Enter the Time Period (In year):");
        double t=scanner.nextDouble();

        double Simple_Interest=(a*r*t)/100;
        System.out.println("The Simpple Interset:$"+Simple_Interest);
        scanner.close();


    }
}
