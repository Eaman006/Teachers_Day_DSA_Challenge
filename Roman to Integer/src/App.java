import java.util.*;
class Solution {
    public int romanToInt(String s) {
        int r = 0;
        int p=0;
        for(int i =s.length()-1; i>=0; i--){
            char a = s.charAt(i);
            int c = 0;
            switch (a) {
                case 'I':
                    c=1;
                    break;
                case 'V':
                    c=5;
                    break;
                case 'X':
                    c=10;
                    break;
                case 'L':
                    c=50;
                    break;
                case 'C':
                    c=100;
                    break;
                case 'D':
                    c=500;
                    break;
                case 'M':
                    c=1000;
                    break;
                default:
                    c=0;
                    break;
            }
            if (p>c) {
                r-=c;
                
            }
            else{
                r+=c;
            }
            p=c;           
        }
        return r;      
    }
}
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        sc.close();
        Solution s = new Solution();
        System.out.println(s.romanToInt(a));  
    }
}