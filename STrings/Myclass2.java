public class Myclass2 {
    public static void main(String[] args) {
        String phrase="Programming IN java";
        String word1=phrase.substring(0,11);
        String word2=phrase.substring(15);

        System.out.println("Word1 is: " + word1); // Output: Word1 is: ramming IN java
        System.out.println("Word2 is: " + word2);
    }
}
