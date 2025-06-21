
public class main4 {
    public static void main(String[] args) {
        int[][] myArray={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        //(n/2)(first numebr+last number)=sum
        //(9/2)*(1+9)=45
        System.out.println("My 2d arra lenght:"+myArray.length);
        int sum=0;
        //iterates through row
        for(int[] rows:myArray){
            //iterate through coluns
            for (int num:rows) {
                sum+=num;
            }
            
        }
        System.out.println("Sum of all  number is:"+ sum);
        
    }
}
