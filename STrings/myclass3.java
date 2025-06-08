public class myclass3 {
    public static void main(String args[]){
        int a=10;
        int b=5;
        int c=2;

        int result=a+b*c;//20
        System.out.println("The Result is:"+result);
        result =(a+b)*c;
        System.out.println("The Result is:"+result);

        // Associativity
        int x=10;
        int y=5;
        int z=2;

        int result1=x-y-++z; //3
        System.out.println("The Result1 is:"+result1);
        result1=x-(y-z);//8
        System.out.println("The Result1 is:"+result1);

    }
}
