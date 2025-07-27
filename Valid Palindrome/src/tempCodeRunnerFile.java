import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        String a = s.replace(" ","");
        a=a.replace(",", "");
        a=a.replace(".", "");
        a=a.replace("/", "");
        StringBuilder r = new StringBuilder();
        for(char c:a.toCharArray()){
            if (Character.isLetter(c)) {
                r.append(c);                
            }
        }
        String b = r.toString();
        b=b.toLowerCase();
        String c = new StringBuffer(b).reverse().toString();
        boolean d=true;
        if (c.equals(b)) {
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