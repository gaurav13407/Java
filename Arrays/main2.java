public class main2 {
    public static void main(String[] args) {
        int[] numbers={1,12,33,45,6,7};
        System.out.println("array length :"+numbers.length);
        int counter=0;
        for(int number:numbers){
            System.out.println("Counter is at:"+counter++);
            System.out.println(number);
        }
        String[] friends={"nansa","asasa","wdedwd","wdwww","wdad"};

        for(String frnd:friends){
            System.out.println("Welcome to my party:"+frnd);
        }
    }
}
