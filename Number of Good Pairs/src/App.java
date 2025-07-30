import java.util.*;
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int r = 0;
        for(int i=0; i<(nums.length-1); i++){
            for(int j=i+1; j<(nums.length);j++){
                if (nums[i]==nums[j]) {
                    r=r+1;                    
                }
            }            
        }
        return r;
        
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
