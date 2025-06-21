import java.util.Arrays;
public class arrrays7 {
    public static void main(String[] args) {
        int[] nums=new int[5];
        System.out.println(Arrays.toString(nums));
        Arrays.fill(nums, 0, 3, 10);
        Arrays.fill(nums,3,5,11);
        System.out.println(Arrays.toString(nums));
        int[] myNums={10,10,10,11,11};
        System.out.println(Arrays.equals(nums, myNums));
    }
}
