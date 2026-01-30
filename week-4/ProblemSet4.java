
public class ProblemSet4 {

    public static void main(String[] args) {

        // ============================================================
        // ques - 1) Two Sum
        // ============================================================
        // link -
        // https://leetcode.com/problems/two-sum/description/

        // ------------------------------------------------------------
        // i) Brute Force
        // ------------------------------------------------------------
        // Idea:
        // Pick one element and check it with every other element
        // to see if their sum equals the target.
        //
        // Time Complexity - O(n^2)
        // Space Complexity - O(1)
        //
        // Code:
        // int n = nums.length;
        // for(int i = 0; i < n; i++) {
        // for(int j = i + 1; j < n; j++) {
        // if(nums[i] + nums[j] == target) {
        // return new int[]{i, j};
        // }
        // }
        // }
        // return new int[]{-1, -1};

        // ------------------------------------------------------------
        // ii) Better Approach (Hashing)
        // ------------------------------------------------------------
        // Idea:
        // Store each number with its index in a HashMap.
        // For every element, check if (target - currentElement)
        // already exists in the map.
        //
        // Time Complexity - O(n)
        // Space Complexity - O(n)
        //
        // Code:
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int i = 0; i < nums.length; i++) {
        // int valueToFind = target - nums[i];
        //
        // if(map.containsKey(valueToFind)) {
        // return new int[]{map.get(valueToFind), i};
        // }
        //
        // map.put(nums[i], i);
        // }
        // return new int[]{-1, -1};

        // ------------------------------------------------------------
        // iii) Optimal Approach (Two Pointer)
        // ------------------------------------------------------------
        // Note:
        // This approach works only when we are asked
        // whether a pair exists (true/false).
        // It does NOT return indices unless extra handling is done.
        //
        // Idea:
        // Sort the array and use two pointers from both ends.
        //
        // Time Complexity - O(n log n)
        // Space Complexity - O(1)
        //
        // Code:
        // (intentionally skipped as problem requires indices)

        // ============================================================
        // ques - 2) Sort an array of 0s, 1s, and 2s
        // ============================================================
        // link -
        // https://leetcode.com/problems/sort-colors/description/

        // ------------------------------------------------------------
        // i) Brute Force
        // ------------------------------------------------------------
        // Idea:
        // Simply sort the array using a sorting algorithm
        // like Merge Sort.
        //
        // Time Complexity - O(n log n)
        // Space Complexity - O(1)
        //
        // Note:
        // No need to implement explicitly.

        // ------------------------------------------------------------
        // ii) Better Approach (Counting)
        // ------------------------------------------------------------
        // Idea:
        // Count the number of 0s, 1s, and 2s,
        // then overwrite the array accordingly.
        //
        // Time Complexity - O(2n)
        // Space Complexity - O(1)
        //
        // Code:
        // int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        // int n = nums.length;
        //
        // for(int i = 0; i < n; i++) {
        // if(nums[i] == 0) cnt0++;
        // else if(nums[i] == 1) cnt1++;
        // else cnt2++;
        // }
        //
        // for(int i = 0; i < cnt0; i++) nums[i] = 0;
        // for(int i = cnt0; i < cnt0 + cnt1; i++) nums[i] = 1;
        // for(int i = cnt0 + cnt1; i < n; i++) nums[i] = 2;

        // ------------------------------------------------------------
        // iii) Optimal Approach (Dutch National Flag Algorithm)
        // ------------------------------------------------------------
        // Idea:
        // Use three pointers:
        // low -> boundary for 0s
        // mid -> current element
        // high -> boundary for 2s
        //
        // Rules:
        // - nums[mid] == 0 → swap with low, move low & mid
        // - nums[mid] == 1 → move mid
        // - nums[mid] == 2 → swap with high, move high
        //
        // Time Complexity - O(n)
        // Space Complexity - O(1)
        //
        // Code:
        // public void sortColors(int[] nums) {
        // int low = 0, mid = 0;
        // int high = nums.length - 1;
        //
        // while(mid <= high) {
        // if(nums[mid] == 0) {
        // swap(low, mid, nums);
        // low++;
        // mid++;
        // }
        // else if(nums[mid] == 1) {
        // mid++;
        // }
        // else {
        // swap(mid, high, nums);
        // high--;
        // }
        // }
        // }
        //
        // public void swap(int i, int j, int[] arr) {
        // int temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
        // }

        // ============================================================
        // ques - 3) Majority Element
        // ============================================================
        // link -
        // https://leetcode.com/problems/majority-element/description/
        // https://www.geeksforgeeks.org/problems/majority-element-1587115620/1

        // ------------------------------------------------------------
        // i) Brute Force
        // ------------------------------------------------------------
        // Idea:
        // Pick each element and count its occurrences by scanning
        // the entire array. If its count is greater than n/2,
        // that element is the majority element.
        //
        // Time Complexity - O(n^2)
        // Space Complexity - O(1)
        //
        // Code:
        // int n = nums.length;
        // int targetCount = n / 2;
        //
        // for(int i = 0; i < n; i++) {
        // int count = 0;
        // for(int j = 0; j < n; j++) {
        // if(nums[i] == nums[j]) {
        // count++;
        // }
        // }
        // if(count > targetCount) {
        // return nums[i];
        // }
        // }
        // return -1;

        // ------------------------------------------------------------
        // ii) Better Approach (Hashing)
        // ------------------------------------------------------------
        // Idea:
        // Use a HashMap to store the frequency of each element.
        // If any element’s count exceeds n/2, return it.
        //
        // Time Complexity - O(n)
        // Space Complexity - O(n)
        //
        // Code:
        // Map<Integer, Integer> map = new HashMap<>();
        // int targetCount = nums.length / 2;
        //
        // for(int num : nums) {
        // map.put(num, map.getOrDefault(num, 0) + 1);
        // }
        //
        // for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
        // if(entry.getValue() > targetCount) {
        // return entry.getKey();
        // }
        // }
        // return -1;

        // ------------------------------------------------------------
        // iii) Optimal Approach (Moore’s Voting Algorithm)
        // ------------------------------------------------------------
        // Idea:
        // Maintain a candidate element and a counter.
        // - If count becomes 0, pick the current element as candidate
        // - Increment count if same as candidate
        // - Decrement count otherwise
        //
        // Time Complexity - O(n)
        // Space Complexity - O(1)

        // ------------------------------------------------------------
        // Case 1: Majority element is guaranteed to exist
        // ------------------------------------------------------------
        //
        // Code:
        // int elem = -1;
        // int count = 0;
        //
        // for(int i = 0; i < nums.length; i++) {
        // if(count == 0) {
        // elem = nums[i];
        // count = 1;
        // }
        // else if(nums[i] == elem) {
        // count++;
        // }
        // else {
        // count--;
        // }
        // }
        // return elem;

        // ------------------------------------------------------------
        // Case 2: Majority element is NOT guaranteed
        // ------------------------------------------------------------
        // Note:
        // After finding the candidate, we must verify its count.
        //
        // Code:
        // int elem = -1;
        // int count = 0;
        //
        // for(int i = 0; i < nums.length; i++) {
        // if(count == 0) {
        // elem = nums[i];
        // count = 1;
        // }
        // else if(nums[i] == elem) {
        // count++;
        // }
        // else {
        // count--;
        // }
        // }
        //
        // int count1 = 0;
        // for(int num : nums) {
        // if(num == elem) {
        // count1++;
        // }
        // }
        //
        // if(count1 > nums.length / 2) {
        // return elem;
        // }
        // return -1;

        // ============================================================
        // ques - 4) Kadane’s Algorithm (Maximum Subarray Sum)
        // ============================================================
        // link -
        // https://leetcode.com/problems/maximum-subarray/description/
        // https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1

        // ------------------------------------------------------------
        // i) Brute Force
        // ------------------------------------------------------------
        // Idea:
        // Generate all possible subarrays and calculate their sums.
        // Track the maximum sum found.
        //
        // Time Complexity - O(n^3)
        // Space Complexity - O(1)
        //
        // Code:
        // (Not written due to very poor performance)

        // ------------------------------------------------------------
        // ii) Better Approach
        // ------------------------------------------------------------
        // Idea:
        // Fix the starting index and expand the subarray to the right.
        // This avoids recalculating sums from scratch.
        //
        // Note:
        // This approach still gives TLE for large inputs, so avoid using it.
        //
        // Time Complexity - O(n^2)
        // Space Complexity - O(1)
        //
        // Code (avoid using):
        //
        // if(nums.length == 1) return nums[0];
        //
        // int maxSum = Integer.MIN_VALUE;
        // for(int i = 0; i < nums.length; i++) {
        // int sum = 0;
        // for(int j = i; j < nums.length; j++) {
        // sum += nums[j];
        // maxSum = Math.max(maxSum, sum);
        // }
        // }
        // return maxSum;

        // ------------------------------------------------------------
        // iii) Optimal Approach (Kadane’s Algorithm)
        // ------------------------------------------------------------
        // Idea:
        // Maintain a running sum.
        // - Add current element to sum
        // - Update maxSum if sum is greater
        // - If sum becomes negative, reset it to 0
        //
        // Time Complexity - O(n)
        // Space Complexity - O(1)
        //
        // Code:
        //
        // int maxSum = nums[0];
        // int sum = 0;
        //
        // for(int i = 0; i < nums.length; i++) {
        // sum += nums[i];
        // maxSum = Math.max(maxSum, sum);
        //
        // if(sum < 0) {
        // sum = 0;
        // }
        // }
        // return maxSum;

        // ============================================================
        // ques - 5) Stock Buy and Sell (Best Time to Buy and Sell Stock)
        // ============================================================
        // link -
        // https://www.geeksforgeeks.org/problems/stock-buy-and-sell-1587115621/1
        // https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

        // ------------------------------------------------------------
        // Optimal Approach
        // ------------------------------------------------------------
        // Idea:
        // Track the minimum price seen so far.
        // For each day, calculate profit by selling on that day.
        // Update maximum profit accordingly.
        //
        // Time Complexity - O(n)
        // Space Complexity - O(1)
        //
        // Code:
        //
        // int maxProfit = 0;
        // int minPrice = prices[0];
        //
        // for(int i = 1; i < prices.length; i++) {
        // int currentProfit = prices[i] - minPrice;
        // maxProfit = Math.max(maxProfit, currentProfit);
        // minPrice = Math.min(minPrice, prices[i]);
        // }
        // return maxProfit;

    }
}