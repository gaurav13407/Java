 public class typeCasting {
    public static void main(String[] args) {
        int num=10;
        double numDouble = num; // Implicit casting (int to double)
        System.out.println("Implicit casting (int to double): " + numDouble);
        System.out.println(num);

        //Explicit casting (double to int)
        double numDouble2 = 10.5;
        int numInt = (int) numDouble2; // Explicit casting (double to int)
        System.out.println("Explicit casting (double to int): " + numInt);
        System.out.println(numDouble2);
    }   
}
