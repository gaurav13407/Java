public class main3 {
    public static int factoril(int n){
        if(n==0){
            return 1;

        }
        else{
            return n*factoril(n-1);
        }
    } 
    public static void main(String[] args) {
        int n=15;
        if(n>15000){
            System.out.println("Dont over do it bro!");
        }
        System.out.println("The factorial of the number is:"+factoril(n));
    }   
}
