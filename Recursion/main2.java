public class main2 {
    public static void getSlicesOfBread(){
        buyBread();
        System.out.println("Got two slices of bread.");
    }

    public static void buyBread(){
        System.out.println("Bought two slices of bread.");
    }
    public static void spreadPeanuntButter(){
        System.out.println("Spread buuter on one side of bread");
    }
    public static void spreadJelly(){
        System.out.println("Spread jelly on other slice.");
    }
    public static void putSlicesTogether(){
        System.out.println("Put the slice togther.");
    }

    public static void makeSandwich(){
        getSlicesOfBread();;
        spreadPeanuntButter();
        spreadJelly();
        putSlicesTogether();
        System.out.println("Sandwhich is ready!");
    }
    public static void main(String[] args) {
        makeSandwich();
    }
}
