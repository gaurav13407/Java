public class main2 {
     public static void main(String[] args) {
        int[][] myArray={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("My 2d arra lenght:"+myArray.length);
        //iterates through row
        for(int[] rows:myArray){
            //iterate through coluns
            for (int num:rows) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
