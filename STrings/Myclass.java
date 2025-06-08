public class Myclass {
    public static void main(String[] args) {
        String quote="May the forth be with you.";
        int length=quote.length(); // Get the length of the string
        System.out.println(length);//Output: 18

        //Character at the given POsition

        char firstChar=quote.charAt(0); // Get the character at index 0
        System.out.println("The First Character is:"+firstChar); // Output: M
        char tenthCHar=quote.charAt(9);
        System.out.println("The tenth Charcter is: "+tenthCHar); 
    }
}
