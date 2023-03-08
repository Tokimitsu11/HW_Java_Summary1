package Colletcions;

import java.util.Arrays;

public class HomeWork {

    public int[] twoSum(int[] nums, int target){
        int[] result;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j] == target){
                    result = new int[]{i, j};
                    System.out.println(Arrays.toString(result));
                    return result;
                }
            }
        }
    return nums;
    }


    public static void main(String[] args) {
        HomeWork HW = new HomeWork();
        HW.twoSum(new int[]{1, 2, 3, 4, 5, 6}, 6);
    }
}
