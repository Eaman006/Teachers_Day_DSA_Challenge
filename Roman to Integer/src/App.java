import java.util.*;
class Solution {
    public int romanToInt(String s) {
        int r = 0;
        for(int i =0; i<s.length(); i++){
            char a = s.charAt(i);
            switch (a) {
                case 'I':
                    r=r+1;

                    break;
                case 'V':
                    r=r+5;
                    break;
                case 'X':
                    r=r+10;
                    break;
                case 'L':
                    r=r+50;
                    break;
                case 'C':
                    r=r+100;
                    break;
                case 'D':
                    r=r+500;
                    break;
                case 'M':
                    r=r+1000;
                    break;
            
                default:
                    break;
            }           
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