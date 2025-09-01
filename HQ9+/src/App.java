import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        if (s.contains("H")) {
            System.out.println("YES");            
        }
        else if (s.contains("Q")) {
            System.out.println("YES");            
        }
        else if (s.contains("9")) {
            System.out.println("YES");            
        }
        
        else{
            System.out.println("NO");
        }
    }
}
