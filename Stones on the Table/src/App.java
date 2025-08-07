import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String a = s.nextLine();
        s.close();
        int c = 0;
        for(int i = 0; i<n-1;i++){
            if (a.charAt(i)==a.charAt(i+1)) {
                c=c+1;                                
            }
        }
        System.out.println(c);
    }
}
