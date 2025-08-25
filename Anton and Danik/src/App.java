import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String a = s.nextLine();
        s.close();
        char b = 'A';
        long c = a.chars().filter(ch->ch==b).count();
        char d = 'D';
        long e = a.chars().filter(ch->ch==d).count();
        if (c>e) {
            System.out.println("Anton");            
        }
        else if (c==e) {
            System.out.println("Friendship");            
        }
        else{
            System.out.println("Danik");
        }
    }
}
