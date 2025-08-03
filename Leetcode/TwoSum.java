import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> val_idx = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (val_idx.containsKey(target - num)) {
                return new int[]{val_idx.get(target - num), i};
            }
            val_idx.put(num, i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum solver = new TwoSum();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solver.twoSum(nums, target);

        System.out.println("Indices: " + Arrays.toString(result));
    }
}
