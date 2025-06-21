import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of rows and colmns");
        int n=scanner.nextInt();

        int[][] matrix= new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Please Enter the value of:"+i+" "+j);
                matrix[i][j]=scanner.nextInt();
            }
        }
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=matrix[i][i];
        }
        System.out.println("The Daigonal sum of matrix is:"+sum);
       
        for (int i = 0; i <n; i++) {
            if(i!=n-1-i){
            sum+=matrix[i][n-1-i];
            }
        }
        System.out.println("The Sum of both  Diagonal:"+sum);
        scanner.close();
    }
}
