import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        s.close();
        if (a.length()<1000) {
            a = Character.toUpperCase(a.charAt(0)) + a.substring(1);
            System.out.println(a);
        }
    }
}
