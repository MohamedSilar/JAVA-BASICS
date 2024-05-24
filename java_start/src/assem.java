import java.util.Scanner;
public class assem {
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);
        
        System.out.println("Enter the assembler:");
        String assemblecode=Scan.nextLine();
        System.out.println("output machine code" + assemble(assemblecode));
    }
        public static String assemble(String assemblecode){
            return "Machine code generate from assembler code";
        }
       

    
    
}
