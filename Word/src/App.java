import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        s.close();
        a=a.trim();
        int count=0;
        int c=0;
        for(int i = 0; i<a.length(); i++){
            if (Character.isUpperCase(a.charAt(i))) {
                count++;
                                
            }
            else{
                c++;
            }
        }
        if (count>c) {
            System.out.println(a.toUpperCase());            
        }
        else{
            System.out.println(a.toLowerCase());
        }

    }
}
