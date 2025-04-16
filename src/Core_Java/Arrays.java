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

        //2D Array
        int arr[][] = new int[3][4];
        for (int i = 0; i < 3;i++){
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();


        }

        //Adding values in the array

        for (int i = 0; i < 3;i++){

            for (int j = 0; j < 4; j++) {
                int random = (int)(Math.random()*100);
                arr[i][j] = random;
            }

        }
        for (int i = 0; i < 3;i++){
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
        //Enhanced For loop
        for(int x[]:arr){
            for (int m:x){
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}
