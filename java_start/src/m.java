import java.util.Scanner;
public class m {
    public static void main(String[] args) {
        System.out.println("Enter the first name:");
       Scanner words = new Scanner(System.in);
       String names = words.nextLine();
       System.out.println("The string name is" +  names); 
       System.out.println("Enter the second name:");
       String sentence = words.nextLine();
       System.out.println("The string name is " +  sentence);
    System.out.println("itz is equal" + names.concat(sentence));

    }
    
}
