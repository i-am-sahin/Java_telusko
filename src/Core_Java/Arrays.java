package Core_Java;

public class Arrays {
    public static void main(String[] args) {
        int nums[] = {3,7,2,4};
        System.out.println(nums[2]);
        nums[2] = 6;// changing the value
        System.out.println(nums[2]);

        int n = nums.length;
        for (int i = 0; i < n;i++){
            System.out.println(nums[i]);
        }
    }
}
