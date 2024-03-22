import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner teo=new Scanner(System.in);
        System.out.println("Enter the First word: ");
        String neo=teo.nextLine();
        System.out.println("Enter the second word: ");
        String keo =teo.nextLine();
        System.out.println("Before swapping the name:\n"+neo + " \n" + keo);
        neo=neo+keo;
        keo = neo.substring(0,neo.length()-keo.length());
        neo=neo.substring(keo.length());
        System.out.println("After the swaping is:\n"+ neo + "\n" + keo);
    }
}
