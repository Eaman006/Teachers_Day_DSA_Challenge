import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        
        int m = prices[0];
        int p = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < m) {
                m = prices[i];
            } else if (prices[i] - m > p) {
                p = prices[i] - m;
            }
        }
        
        return p;
    }
}
public class App {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        String a = n.nextLine();
        n.close();
        a=a.substring(1,a.length()-1);
        String [] b = a.split(",");
        int [] p = new int[b.length];
        for(int i = 0; i<p.length;i++){
            p[i]=Integer.parseInt(b[i]);
        }
        Solution s = new Solution();
        System.out.println(s.maxProfit(p));
        
    }
}
