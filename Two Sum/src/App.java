import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        String c = b.substring(1, b.length() - 1);
        String[] d = c.split(",");
        int a[] = new int[d.length];
        for (int i = 0; i < d.length; i++) {
            a[i] = Integer.parseInt(d[i].trim());
        }
        int k = sc.nextInt();
        Solution s = new Solution();
        int result[] = s.twoSum(a, k);
        System.out.println(Arrays.toString(result));

    }
}
