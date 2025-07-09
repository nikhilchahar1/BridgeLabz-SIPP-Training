import java.util.*;

public class ZeroSumSubarrays {
    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();

        int sum = 0;
        map.put(0, new ArrayList<>(Arrays.asList(-1))); // Handle sum from index 0

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                List<Integer> indices = map.get(sum);
                for (int start : indices) {
                    result.add(new int[]{start + 1, i}); // Subarray from (start+1) to i
                }
            }

            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 3, -1, -2, 4, -4};
        List<int[]> subarrays = findZeroSumSubarrays(arr);

        for (int[] sub : subarrays) {
            System.out.println("Subarray found from index " + sub[0] + " to " + sub[1]);
        }
    }
}
