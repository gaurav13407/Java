public class Unary {
    public static void main(String[] args) {
        //unary operators
        int a=5;
        int negative=-a; // Unary minus operator
        //System.out.println("Unary minus of a is: " + negative);

        //Increment Operators
        //int b = a++; // Post-increment operator
       // System.out.println("Post-increment of a is: " + b);// b=5
        //System.out.println("Value before Incrementing a is: "+ a);//a=6

        int c = ++a; // Pre-increment operator
        System.out.println("Pre-increment of a is: " + c);//c=7
        System.out.println("Value after Incrementing a is: " + a);//a=7

        //Decrement Operators
        int d = a--; // Post-decrement operator
        System.out.println("Post-decrement of a is: " + d);//d=7
        System.out.println("Value after Decrementing a is: " + a);//a=6
        int e = --a; // Pre-decrement operator
        System.out.println("Pre-decrement of a is: " + e);//e=5
        System.out.println("Value after Decrementing a is: " + a);//a=5
    }
}
