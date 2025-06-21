import java.util.Arrays;
public class main {
    public static void main(String[] args) {
        int[][] myArray=new int[3][3];
        myArray[0][0]=1;
        myArray[0][1]=2;
        myArray[0][2]=3;
        myArray[1][0]=4;
        myArray[1][1]=5;
        myArray[1][2]=6;
        myArray[2][0]=7;
        myArray[2][1]=8;
        myArray[2][2]=9;
        System.out.println("My 2d aray length:"+myArray.length);
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
