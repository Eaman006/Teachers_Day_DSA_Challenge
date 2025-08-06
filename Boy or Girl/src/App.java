import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        s.close();
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<a.length(); i++){
            char c = a.charAt(i);
            if (sb.indexOf(String.valueOf(c))==-1) {
                sb.append(c);                
            }
        }
        if (sb.length()%2==0) {
            System.out.println("CHAT WITH HER!");            
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}
