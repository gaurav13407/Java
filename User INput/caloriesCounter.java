import java.util.Scanner;

public class caloriesCounter {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the Three Foods you ate today:");
        System.out.println("Food 1: ");
        String food1=scanner.nextLine();
        System.out.println("Food 2: ");
        String food2=scanner.nextLine();
        System.out.println("Food 3: ");
        String food3=scanner.nextLine();
        //scanner.nextLine(); // Consume the newline character left by nextLine()
        System.out.println("Enter the calories for each food item:");
        System.out.println("Calories of "+food1+" is:");
        int Calories1=scanner.nextInt();
        System.out.println("Calories of "+food2+" is:");
        int Calories2=scanner.nextInt();
        System.out.println("Calories of "+food3+" is:");
        int Calories3=scanner.nextInt();
        int totalCalories=Calories1+Calories2+Calories3;
        System.out.println("Total calories consumed today: " + totalCalories);

        System.out.println("The colaoreis in"+food1+" is:"+ Calories1);
        System.out.println("The colaoreis in"+food2+" is:"+ Calories2);
        System.out.println("The colaoreis in"+food3+" is:"+ Calories3);
        scanner.close();
    }
}
 