import java.util.*;;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.nextLine();
        sc.close();
        long a = 0;
        long b=n-1;
        if(n%2==0){
            a=n/2;
        }
        else{
            a=b/2-n;
        }
        System.out.println(a);
    }
}
