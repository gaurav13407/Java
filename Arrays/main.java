public class main {
    public static void main(String[] args) {
        int[] numbers; //Declaring the array but not taking space
        numbers=new int[5];//initializing
        int[] numbers2={1,2,3,4,5};
        numbers2[0]=420;
        int firstnumber=numbers2[0];
        System.out.println(firstnumber);
    }    
}
