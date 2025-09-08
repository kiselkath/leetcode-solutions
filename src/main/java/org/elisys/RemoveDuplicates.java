package org.elisys;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,4,5,6,6,6,10};
        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[k]=nums[i+1];
                k++;
            }
        }
       for(int i:nums)
       {
           System.out.print(i+",");
       }
       System.out.println(" ");
        return k;

        //HashSet<Integer> uniqueNumbers = new HashSet<>();

//        for (int i = 0;i < nums.length; i++){
//            uniqueNumbers.add(nums[i]);
//        }
//        return uniqueNumbers.size();
    }
}


