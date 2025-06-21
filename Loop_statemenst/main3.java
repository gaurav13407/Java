import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        //fibonaci sequence
        // 0 1 1 2 3 5 8 13
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n=scanner.nextInt();

        int first=0;
        int second=1;
        if(n==1){
            System.out.println(first);
        }
        else{
            System.out.print(first+" "+second);

            for(int i=3;i<=n;i++){
                int nextTerm=first+second;
                System.out.print(" "+nextTerm);
                first=second;
                second=nextTerm;
            }
        }
        scanner.close();
    }    
}
