public class main3 {
    public static void main(String[] args) {
        int[] numbers={10,12,33,45,5,7};
        int sum=0;
        int max=numbers[0];
        int min=numbers[0];
        for(int number:numbers){
            if(number>max){
                max=number;
            }
            if(number<min){
                min=number;
            }
            sum+=number;
        }
        System.out.println("The sum of all elements is :"+sum);
        System.out.println("The largest umber is:"+max);
        System.out.println("The minimum is :"+min);
    }    
}
