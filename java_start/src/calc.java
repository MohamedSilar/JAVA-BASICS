import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner m= new Scanner(System.in);
        Scanner n= new Scanner(System.in);
        System.out.println("Choose one option");
        System.out.println("1.addition \n 2.subraction \n 3.Multiplication \n 4.division \n");
        System.out.println("Enter the option:");
        int teo = n.nextInt();
        if (teo<=4) {
            System.out.println("Sorry");
        }
        System.out.println("Enter the first number:");
        int leo = m.nextInt();
        System.out.println(leo);
        System.out.println("Enter the Second number:");
        int keo = m.nextInt();
        System.out.println( keo);
        int cal = teo;
        switch (cal) {
            case 1:
            int add = leo + keo ;
            System.out.println("THE ADDITION IS : " + add);
                break;
            case 2:
            int sub = leo - keo;
            System.out.println("THE SUBRACTION IS : " + sub);
                break;
            case 3:
            int mul = leo * keo;
            System.out.println("THE MULTIPLICATION IS : " + mul);
            break;
            case 4:
            int divi = leo / keo ;
            System.out.println("THE DIVISION IS :" + divi);
            break;
            default:
            System.out.println("sorry you enter wrong");
                break;
    


    }

    
}
}
