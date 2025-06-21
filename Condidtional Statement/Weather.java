import java.util.Scanner;

public class Weather {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        System.out.println("Welcome to the Galatic Weather Advisor");
        System.out.println("Please Enter the planent you are on(Earth,Mars,Vens,Jupiter):");

        String planet=scanner.nextLine().trim().toLowerCase();

        System.out.println("Please Enter the the current Tempearture in celsiuis:");
        double temprature=scanner.nextDouble();

        String advice="";

        if(planet.equals("earth")){
            if(temprature<0){
                advice="its freezing on Earth!wear a heavy coat";
            }
            else if(temprature<15){
                advice="Its quite chiily on Earth.Wear A jacket";
            }
            else if(temprature<25){
                advice="";
            }
        }
        System.out.println(advice);
        scanner.close();
    }
}
 