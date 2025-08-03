import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        sc.close();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if (s1.equals(s2)) {
            System.out.println("0");
        }
        else if (s1.compareTo(s2)>0) {
            System.out.println("1");
            
        }
        else if (s1.compareTo(s2)<0) {
            System.out.println("-1");
            
        }
    }
}
