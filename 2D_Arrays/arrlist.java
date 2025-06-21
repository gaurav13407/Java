import java.util.ArrayList;

public class arrlist {
    public static void main(String[] args) {
        ArrayList<String> fruits= new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Dates");

        System.out.println(fruits.get(2));
        boolean hasbanana=fruits.contains("Banana");
        System.out.println(hasbanana);
        System.out.println(fruits.size());
        fruits.remove("Banana");
        fruits.remove(0);
        fruits.add(1,"plum");

        for(String fruit:fruits){
            System.out.println(fruit);
        }
    }    
}
