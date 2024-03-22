import java.util.Scanner;
public class rep {
    public static void main(String[] args) {
        Scanner keo = new Scanner(System.in);
        System.out.println("Enter the number");
        int neo=keo.nextInt();
        for(int i=1;i<=10;i++){
            int s;
            s=i*neo;
            System.out.println(i+ "*" + neo +'=' + s );
        
        }
    }
    
    
}
