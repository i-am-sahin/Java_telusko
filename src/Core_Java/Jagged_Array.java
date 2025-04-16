package Core_Java;

public class Jagged_Array {
    public static void main(String[] args) {
        int nums[][] = new int[3][];
        //We've to define all the col size individually
        nums[0] = new int[1];
        nums[1] = new int[5];
        nums[2] = new int[7];
        //Adding Values in array
        int n = nums.length;
        for (int i = 0; i < n;i++){
            int m = nums[i].length;

            for (int j = 0; j < m; j++) {
                int random = (int)(Math.random()*100);
                nums[i][j] = random;
            }

        }

        //Printing the values of arrays
        for (int i = 0; i < n;i++){
            int m = nums[i].length;
            for (int j = 0; j < m; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();

        }
        //Enhanced For loop
//        for(int x[]:nums){
//            for (int m:x){
//                System.out.print(m + " ");
//            }
//            System.out.println();
//        }


    }
}
