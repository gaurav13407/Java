
public class main3 {
    public static void main(String[] args) {
        int[][] myArray={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("My 2d arra lenght:"+myArray.length);
        int largest=myArray[0][0];
        int lowest=myArray[0][0];
        //iterates through row
        for(int[] rows:myArray){
            //iterate through coluns
            for (int num:rows) {
                if(num>largest){
                    largest=num;
                }
                if(num<lowest){
                    lowest=num;
                }
            }
            
        }
        System.out.println("largest number is:"+ largest);
        System.out.println("Lowest number is:"+lowest);
    }
}
