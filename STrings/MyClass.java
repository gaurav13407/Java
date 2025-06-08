public class MyClass {
    public static void main(String args[]){
        String morning="Good Morning";
        System.out.println(morning);

        String night=new String("Good Night");
        System.out.println(night);
        night="Bad Night";
        System.out.println(night);

        String firstName="John";
        String lastName="Doe";
        //String concatenation
        String fullName=firstName+" "+lastName;
        // Conversion
        int age=20;
        String bio="I am "+fullName+" And am "+age+" years old.";
        System.out.println(bio);
    }
}
