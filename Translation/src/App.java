import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        a=a.trim();
        a=a.toLowerCase();
        String b = s.nextLine();
        s.close();
        b=b.trim();
        b=b.toLowerCase();
        int c = 0;
        if (a.length()==b.length()) {
            for(int i=0; i<a.length();i++){
                if (a.charAt(i)==b.charAt(a.length()-1-i)) {
                    c=c+1;                                        
                }
            }            
        }
        if (c==a.length()) {
            System.out.println("YES");
            
        }
        else{
            System.out.println("NO");
        }       
    }
}
