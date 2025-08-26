import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        sc.close();
        String r ="";
        for(int i =0; i<a.length(); i++){
            if (a.charAt(i)==b.charAt(i)) {
                r=r+"0";                
            }
            else{
                r=r+"1";
            }
        }
        System.out.println(r);
    }
}
