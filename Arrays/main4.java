import java.util.Arrays;
public class main4 {
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7,3,8};
        String[] names={"Frank","Tank","Crack"};
        System.out.println("Pre Sorting:"+Arrays.toString(nums));
        System.out.println(Arrays.toString(names));
        Arrays.sort(nums);
        System.out.println("Post sorting:"+Arrays.toString(nums));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}
