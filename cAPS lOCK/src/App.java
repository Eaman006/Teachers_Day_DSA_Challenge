import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String a = s.substring(1);
        StringBuilder r=new StringBuilder();
        if (s.equals(s.toUpperCase())) {
            System.out.println(s.toLowerCase());
            
        }
        else if (a.equals(a.toUpperCase())){
            r=r.append(String.valueOf(s.charAt(0)).toUpperCase());
            r.append(a.toLowerCase());
            System.out.println(r);

            
        }
        else{
            System.out.println(s);
        }
        
        
        

    }
}
