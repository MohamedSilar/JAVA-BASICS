import java.util.Scanner;

public class newcal {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        // Scanner n = new Scanner(System.in);
       
        System.out.println("Choose one option");
        String[] myarray = { "1.ADDITION", "2.SUBRACTION", "3.MULTIPLICATION", "4.DIVIVISION" };
        for (int i = 0; i < myarray.length; i++) {
            System.out.println(myarray[i]);
        }
        
        System.out.println("please enter the option:");
        int teo = m.nextInt();
        if (teo >= 5) {
            System.out.println("Sorry you enter the wrong number");
        } else {
            System.out.println("Enter the first number:");
            int leo = m.nextInt();
            // System.out.println(leo);
            System.out.println("Enter the Second number:");
            int keo = m.nextInt();
            // System.out.println( keo);
            // int cal = teo;
            switch (teo) {
                case 1:
                    int add = leo + keo;
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
                    int divi = leo / keo;
                    System.out.println("THE DIVISION IS :" + divi);
                    break;
                default:
                    System.out.println("sorry you enter wrong");
                    break;
            }

        }

    }
}
