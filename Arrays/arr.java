public class arr {
    public static void main(String[] args) {
        int[] num={2,5,1,3,4,7};
        //2,3,5,4,1,7
        int n=num.length/2;
        int[] rearranged =new int[num.length];

        for(int i=0;i<n;i++){
            rearranged[2*i]=num[i];
            rearranged[2*i+1]=num[i+n];
        }
        System.out.println("Rearranged array:");
        for(int i:rearranged){
            System.out.print(i+" ");
    }
    }    
}
