import java.util.Scanner;

public class main5 {
    public static String reverse(String str){
        if(str.isEmpty() || str.length()==1){
            return str;
        }

        return str.charAt(str.length()-1)+reverse(str.substring(0, str.length()-1));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String input=scanner.nextLine();
        String reverseString=reverse(input);
        System.out.println(reverseString);
        scanner.close();
    }
}
