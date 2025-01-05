// Given n non-negative integers representing an elevation map where the width
// of each bar is 1, compute how much water it can trap after raining.

 

// Example 1:


// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by
// array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water 
// (blue section) are being trapped.
// Example 2:

// Input: height = [4,2,0,3,2,5]
// Output: 9







import java.util.*;
class Main {
    
    public static int trap(int[] height) {
        int n = height.length;
        if (n == 0) 
            return 0;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int water = 0;
        for (int i = 0; i < n; i++) {
            water = water + Math.max(Math.min(leftMax[i], rightMax[i]) - height[i], 0);
        }

        return water;
    }

    public static void main(String[] k) { 
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Enter the Number of Building ");
        int num = s1.nextInt();
        int height[] = new int[num];
        
        System.out.println("Enter the Height of Building  ");
        for(int i = 0; i < num; i++){
            height[i] = s1.nextInt();
        }
        
        int result = trap(height);
        System.out.println("Storing Water in Block ");
        System.out.println(result);
 
    }
}
