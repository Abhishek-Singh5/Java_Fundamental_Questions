class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // for(int i = 0; i<nums.length -1 ; i++){
        //     for(int j = i+1; j < nums.length; j++) {
        //         if(nums[i] + nums[j] == target) {
        //             return new int [] {i, j};
        //         }
        //     }
        // }

        // return new int[] {};


        HashMap<Integer, Integer> map = new HashMap<Integer, Integer> ();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                return new int[] { map.get(nums[i]), i };
            } else {
                map.put(target - nums[i], i);
            }
        }

        return new int[] {};
    }
}