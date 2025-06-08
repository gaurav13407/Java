public class MyClass2 {
    public static void main(String[] args) {
        String phrase="The quick brown fox";

        String newPhrase=phrase.replace('o', 'a');

        System.out.println("Original Phrase: " + phrase); // Output: The quick brown fox
        System.out.println("Modified Phrase: " + newPhrase); // Output: The quick brawn fax

        String upperCaseString=phrase.toUpperCase();
        System.out.println("Captalize phrase:"+upperCaseString);

        String lowerCaseString=phrase.toLowerCase();
        System.out.println("Captalize phrase:"+lowerCaseString);
    }
}
