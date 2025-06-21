public class labels1 {
    public static void main(String[] args) {
        outerloop://label
        for (int i=0;i<=3;i++){
            innerloop://another loop
            for(int j=1;j<=3;j++){
                if(i==2 && j==2){
                    continue outerloop;
                }
                System.out.println("i:"+i+",j:"+j);
            }
        }
        System.out.println("Loop Ended");
    }    
}
