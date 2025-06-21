import java.util.Arrays;
public class main6 {
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7,3,8};
        System.out.println("num:"+Arrays.toString(nums));
        int[] backup=nums;//by reference
        int[] realbackup=Arrays.copyOf(nums, nums.length);
        int[] lessnums=Arrays.copyOf(nums,  5);
        Arrays.sort(nums);//sort nums array
        System.out.println("num after sorting:"+Arrays.toString(nums));
        System.out.println("Back up of nums:"+Arrays.toString(realbackup));
        System.out.println("Less nums:"+Arrays.toString(lessnums));
    }
}
