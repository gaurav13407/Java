import java.util.Random;
import java.util.Scanner;

public class main6 {

    public static String scrambelWord(String word,Random random){
        char[] letters=word.toCharArray();
        for(int i=0;i<letters.length;i++){
            int j=random.nextInt(letters.length);
            char temp=letters[i];
            letters[i]=letters[j];
            letters[j]=temp;
        }
        return new String(letters);
    }
    public static void main(String[] args) {
    

        Scanner scanner =new Scanner(System.in);
        Random random =new Random();

        //Predefine list of words
        String[] wordlist={"magic","wizard","spell","potion","alchemy","sorcery","wand","dragon","cauldron","broomstick"};

        int playScore=0;
        boolean keepPlaying=true;
        System.out.println("Welcome to word Scramble Wizard");
        System.out.println("Unscrambel the magic word to score the point");

        //game loop
        while(keepPlaying){
            String word=wordlist[random.nextInt(wordlist.length)];
            String scramble=scrambelWord(word, random);
            System.out.println("Scrambled word : "+scramble);
            boolean wordGussed=false;
            int attempts=3;
            while(attempts>0&&!wordGussed){
                System.out.println("YOur Guess:");
                String playerguess=scanner.nextLine();

                if(playerguess.equalsIgnoreCase(word)){
                System.out.println("Correct! you've unscrabled the word");
                playScore++;
                wordGussed=true;
                System.out.println("your current score is: "+playScore);
                }else{
                attempts--;
                System.out.println("Wrong! Attemps remaning: "+attempts);
            }

            }
            if(!wordGussed){
                System.out.println("The correct word was: "+word);
                System.out.println("Do you want to play again?(yes/no):");
                String response=scanner.nextLine();
                keepPlaying=response.equalsIgnoreCase("yes");
            }
        }
        System.out.println("Thank you for playing! Your final score:"+playScore);
        scanner.close();
    }
}
