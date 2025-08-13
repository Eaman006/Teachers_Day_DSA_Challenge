import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=0;
        sc.nextLine();
        for(int i =0; i<n; i++){
            String s = sc.nextLine();
            switch (s) {
                case "--X":
                    --x;                    
                    break;
                case "++X":
                    ++x;                    
                    break;
                case "X--":
                    x--;                    
                    break;
                case "X++":
                    x++;                    
                    break;
                
            
                default:
                    break;
            }
        }
        System.out.println(x);
    }
}
