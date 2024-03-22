import java.util.Scanner;

public class small {
    public static void main(String[] args) {
        Scanner leo=new Scanner(System.in);
        System.out.println("Enter the first Number:");
        double X=leo.nextDouble();
        System.out.println("Enter the Second Number:");
        double Y=leo.nextDouble();
        System.out.println("Enter the Third Number:");
        double Z=leo.nextDouble();

    System.out.print("The Smallest IS :  " + smallest(X ,Y , Z) + "/n");
    }
    public static double smallest (double X ,double Y ,double Z)
    {
        return Math.min(Math.min(X,Y),Z);
    }
    
}
    
