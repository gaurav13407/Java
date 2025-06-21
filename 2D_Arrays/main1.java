
public class main1 {
    public static void main(String[] args) {
        int[][] myArray={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("My 2d arra lenght:"+myArray.length);
        //iterates through row
        for(int i=0;i<myArray.length;i++){
            //iterate through coluns
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
