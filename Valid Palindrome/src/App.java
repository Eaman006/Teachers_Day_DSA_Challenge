import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        String a = s.replace(" ","");
        a=a.replace(",", "");
        a=a.replace(".", "");
        a=a.replace("/", "");
        
        a=a.toLowerCase();
        String c = new StringBuffer(a).reverse().toString();
        boolean d=true;
        if (c.equals(a)) {
             d=true;
            
            
        }
        else{
             d =false;
            
        }
        return d;     
               
        
    }
}
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution so=new Solution();
        boolean result=so.isPalindrome(s);
        System.out.println(result);
           

    }
}