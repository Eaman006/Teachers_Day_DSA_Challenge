import java.util.*;
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> r = new ArrayList<>();
        for(int i=1; i<=n; i++ ){
            if (i%3==0 && i%5!=0) {
                r.add("Fizz");
                
            }
            if (i%5==0 && i%3!=0) {
                r.add("Buzz");
                
            }
            if (i%3==0 && i%5==0) {
                r.add("FizzBuzz");
                
            }
            if(i%3!=0 && i%5!=0){
                r.add(Integer.toString(i));
            }
        }
        return r;

        

    }
}
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution s =new Solution();
        
        System.out.println(s.fizzBuzz(n));      
        sc.close();
    }
    
}
