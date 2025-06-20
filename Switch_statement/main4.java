import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Season:");
        String season=scanner.nextLine();
        switch(season){
            case "Spring":
            System.out.println("the floweers are blomming");
            break;
            case "Summer":
            System.out.println("Its sunnay and hot");
            break;
            case "Winter":
            System.out.println("Its Snowing and icing");
            break;
            case "Autum":
            System.out.println("Leave are falling from the tree");
            break;
            default :
            System.out.println("I Have Never heard of this season Before");
            break;
        }
        scanner.close();
    }    
}
