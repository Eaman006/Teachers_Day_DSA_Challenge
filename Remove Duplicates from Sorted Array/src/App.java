import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==nums[i+1]) {
                nums[i+1]=nums[i+2];                               
            }
            
        }
        return nums.length;
        
    }
}
public class App {
    public static void main(String[] args){
        Scanner n= new Scanner(System.in);
        String a = n.nextLine();
        a=a.substring(1,a.length()-1);
        String [] b =a.split(",");
        int[] c = new int[b.length];
        for(int i=0; i<c.length;i++){
            c[i]=Integer.parseInt(b[i]);
        }
        Solution s = new Solution();
        System.out.println(s.removeDuplicates(c));
        
    }
}
