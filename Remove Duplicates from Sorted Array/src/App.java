import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int u = 0; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[u]) {
                u++;
                nums[u] = nums[i];
            }
        }
        
        return u + 1; 
    }
}
public class App {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        String a = n.nextLine();
        n.close();
        
        a = a.substring(1, a.length()-1);
        String[] b = a.split(",");
        int[] c = new int[b.length];
        for(int i = 0; i < c.length; i++){
            c[i] = Integer.parseInt(b[i].trim());
        }
        Solution s = new Solution();
        System.out.println(s.removeDuplicates(c));
        System.out.print("[");
        for(int i = 0; i < s.removeDuplicates(c); i++){
            System.out.print(c[i]);
            if(i < s.removeDuplicates(c) - 1) System.out.print(", ");
        }
        System.out.print("]");
    }
}
