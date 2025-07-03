import java.util.Scanner;

public class main1 {
    //122-(98-97)=121 b-> y
    //122-(100-97)=119 d->w
    // 90-(66-65)=89 B->Y
    public static char atbash(char ch){
        if(ch>='a'&& ch<='z'){
            return(char)('z'-(ch-'a'));
        }else if(ch>='A'&& ch<='Z'){
            return(char)('Z'-(ch-'A'));
        }else{
            return ch;
        }
    }

    public static String encoded(String input, int index){
        if(index==input.length()){
            return "";
        }

        char ch=input.charAt(index);
        char encodedChar=atbash(ch);
        //recursive 
        return encodedChar+encoded(input, index+1);
    }

    public static String decoded(String input,int index){
         if(index==input.length()){
            return "";
        }

        char ch=input.charAt(index);
        char decodedChar=atbash(ch);
        //recursive 
        return decodedChar+decoded(input, index+1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu

        System.out.println("Welcome to the Encoder-Decoder game");
        System.out.println("1: Encoded a String");
        System.out.println("2: Decoded a String");
        System.out.print("Chose an option (1 or 2):");
        int choice=scanner.nextInt();
        scanner.nextLine();//Consume new line

        System.out.print("Enter the String:");
        String input =scanner.nextLine();
        
        if(choice==1){
            String encodedString=encoded(input, 0);
        System.out.println("Encoded string: "+encodedString);
        }else if(choice==2){
            String decodedString=decoded(input, 0);
            System.out.println("decoded string: "+decodedString);
        }
        else{
            System.out.println("Invalid Choice");
        }
        


        scanner.close();
    }
}
