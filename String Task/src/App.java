import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        s=s.toLowerCase();
        s=s.replaceAll("[aeiouy]", "");
        String [] a=s.split("");
        s= String.join(".",a);
        System.out.println("."+s);    
    }
}
