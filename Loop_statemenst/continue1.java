public class continue1 {
  public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            if(i==3){
                System.out.println("we Igonre this one!");
                continue;
            }
            System.out.println(i);
        }
        System.out.println("After The loop");
    }    
}