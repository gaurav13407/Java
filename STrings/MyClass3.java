public class MyClass3 {
    public static void main(String[] args) {
        String name="Alice";
        int age=30;
        //%s for string
        //%d for int

        String message=String.format("Hello,%s! You are %d yearn old",name,age);
        System.out.println(message);

        double price=1234.567;
        String formatedprice=String.format("The price  is $%.2f",price);
        System.out.println(formatedprice);
    }
}
