import java.util.HashMap;
import java.util.Map;

public class Problems {
    
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 2, 3, 2, 1, 4};

        // ques - 1) Counting frequencies of array elements
        frequencyArray1(arr, 2);
        frequencyArray2(arr, 2);

        // ques - 2) Find the highest/lowest frequency element
        freqMaxMin(arr);


    }

    // ques 1: Counting frequency of array elements

    // --- approach 1 (array hashing) ---
    // assuming values <= 1000
    public static void frequencyArray1(int arr[], int query) {
        /*
        Time Complexity:
        - Precomputation: O(n)
        - Query: O(1)

        Space Complexity:
        - O(maxValue) -> here O(1000)
        */

        int[] hash = new int[1001];

        // precomputation
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        // fetching query
        System.out.println("Frequency of " + query + " is " + hash[query]);
    }

    // --- approach 2 (using HashMap) ---
    public static void frequencyArray2(int arr[], int query) {
        /*
        Time Complexity:
        - Precomputation: O(n)
        - Query: O(1) average case

        Space Complexity:
        - O(n)
        */

        Map<Integer, Integer> map = new HashMap<>();

        // precomputation
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // fetching safely
        System.out.println("Frequency of " + query + " is " + map.getOrDefault(query, 0));
    }


    // ques 2: Find highest & lowest frequency element

    public static void freqMaxMin(int arr[]) {
        /*
        Time Complexity:
        - O(n)

        Space Complexity:
        - O(n)
        */

        Map<Integer, Integer> map = new HashMap<>();

        // frequency count
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;

        int maxElement = 0;
        int minElement = 0;

        for (int key : map.keySet()) {
            int freq = map.get(key);

            if (freq > maxFreq) {
                maxFreq = freq;
                maxElement = key;
            }

            if (freq < minFreq) {
                minFreq = freq;
                minElement = key;
            }
        }

        System.out.println("Max frequency element: " + maxElement + 
                           " (frequency = " + maxFreq + ")");
        System.out.println("Min frequency element: " + minElement + 
                           " (frequency = " + minFreq + ")");
    }
    
}
