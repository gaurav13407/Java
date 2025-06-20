import java.util.Scanner;

public class Advanture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Ultimate Advanture Game!");
        System.out.println("Your Goal is to find the hidden treasure Choose Wisley");
        System.out.println("You are at a crossroad.Do you want to go left or right?");
        System.out.println("Type 'left' or 'right':");
        String choice1=scanner.nextLine().toLowerCase();

        switch(choice1){
        case "left":
        System.out.println("You walk down a dark path and find a mysterious cave.");
        System.out.println("Do You Want to Enter the cave or walk past it?");
        System.out.println("Type 'Enter' or 'walk':");
        String choice2=scanner.nextLine().toLowerCase();
        switch(choice2){
        case "enter":
        System.out.println("inside the cave you find an slepping dragon!");
        System.out.println("Do you want to fight the dragon or sneak past it?");
        System.out.println("Type 'fight'  or 'sneak':");
        String choice3=scanner.nextLine().toLowerCase();
        switch(choice3){
            case "fight":
            System.out.println("You bravely fought the dragon and win the treasure");
            break;
            case "sneak":
            System.out.println("you sneak past the dragon and found the treasure!");
            break;
            default:
            System.out.println("Invalid choice! You caught by the dragon and lost");
            break;
        }
        break;
        case "walk":
        System.out.println("you walk past the cave and fall into hidden trap and lost");
        break;
        default :
        System.out.println("Invalid Choice! You got lost in the wilderness");
        break;
        }
        
        case "right":
        break;
        default:
        System.out.println("Wrong Choice!");
        break;
        }
    }
}
