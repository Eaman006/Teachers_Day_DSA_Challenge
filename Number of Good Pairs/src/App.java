import java.util.*;
class Solution {
    public int numIdenticalPairs(int[] nums) {
        
    }
}
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        a=a.substring(1, a.length()-1);
        String [] b=a.split(",");
        int[] nums = new int[b.length];
        for(int i = 0; i<nums.length;i++){
            nums[i] = Integer.parseInt(b[i]);
        }
        Solution s = new Solution();
        System.out.println(s.numIdenticalPairs(nums));                
    }
}
