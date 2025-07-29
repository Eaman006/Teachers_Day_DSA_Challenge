import java.util.*;
class Solution {
    public int findNumbers(int[] nums) {
        String b [] = new String[nums.length];
        int a = 0;
        for(int i =0; i<b.length ; i++){
            b[i]=String.valueOf(nums[i]);
            if(b[i].length()%2==0){
                a=a+1;

            }           
        }
        
        return a;
        
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a =sc.nextLine();
        a = a.substring(1,a.length()-1);
        String [] b=a.split(",");
        int c[] = new int[b.length];
        for(int i = 0; i<c.length ; i++){
            c[i]= Integer.parseInt(b[i].trim());
        }
        Solution s = new Solution();
        System.out.println(s.findNumbers(c));
        sc.close();
        


        
    }
}
