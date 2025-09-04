import java.util.*;;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        sc.close();
        int a = 0;
        for(int i = 1; i<=n; i++){
            if (i%2!=0) {
                a=a-i;                
            } 
            else{
                a=a+i;
            }           
        }
        System.out.println(a);
    }
}
