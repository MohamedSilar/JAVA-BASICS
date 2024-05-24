import java.util.HashMap;
import java.util.Scanner;

public class mul {
    public static void main(String[] args) {
        
        HashMap<String, Integer> symbolTable = new HashMap<>();
        
        // Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter assembly code (label:address), type 'end' to finish:");

        // Reading input line by line
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            
            // If the user inputs 'end', break the loop
            if (line.equalsIgnoreCase("end")) break;

            // Splitting the input line into label and address
            String[] parts = line.split(":");
            if (parts.length == 2) {
                String label = parts[0].trim();
                int address;
                try {
                    address = Integer.parseInt(parts[1].trim());
                    // Adding the label and address to the symbol table
                    symbolTable.put(label, address);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid address format for label: " + label);
                }
            } else {
                System.out.println("Invalid input format. Correct format: label:address");
            }
        }

        // Displaying the symbol table
        System.out.println("Symbol Table:");
        for (String label : symbolTable.keySet()) {
            System.out.println(label + ": " + symbolTable.get(label));
        }
        
        // Closing the scanner
        scanner.close();
    }
}


FOR PASS-2:

import java.util.HashMap;
import java.util.Scanner;

public class Pass2 {
    // Sample opcodes for instructions
    // This HashMap stores the opcode mappings for different assembly instructions
    static final HashMap<String, String> opcodeTable = new HashMap<>();
    
    // Static block to initialize the opcode table
    static {
        opcodeTable.put("LOAD", "01");
        opcodeTable.put("STORE", "02");
        opcodeTable.put("ADD", "03");
        opcodeTable.put("SUB", "04");
        opcodeTable.put("JUMP", "05");
    }

    public static void main(String[] args) {
        // Sample symbol table, in a real scenario, this would be created by Pass 1
        HashMap<String, Integer> symbolTable = new HashMap<>();
        symbolTable.put("start", 100);
        symbolTable.put("loop", 200);
        symbolTable.put("end", 300);

        // Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter assembly code (instruction), type 'end' to finish:");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("end")) break;

            // Generate machine code for the given instruction
            String machineCode = generateMachineCode(line, symbolTable);
            if (machineCode != null) {
                System.out.println("Machine code for instruction: " + machineCode);
            } else {
                System.out.println("Invalid instruction: " + line);
            }
        }
        
        // Close the scanner to free up resources
        scanner.close();
    }

    // Method to generate machine code for a given instruction
    public static String generateMachineCode(String instruction, HashMap<String, Integer> symbolTable) {
        // Split the instruction into parts (opcode and operand)
        String[] parts = instruction.split(" ");
        if (parts.length < 2) return null;

        // Retrieve the opcode from the opcode table
        String opcode = opcodeTable.get(parts[0].toUpperCase());
        if (opcode == null) return null;

        String operand = parts[1];
        String address = null;

        // Check if the operand is a label in the symbol table
        if (symbolTable.containsKey(operand)) {
            // Format the address as a 3-digit number
            address = String.format("%03d", symbolTable.get(operand));
        } else {
            // Try to parse the operand as an immediate value
            try {
                address = String.format("%03d", Integer.parseInt(operand));
            } catch (NumberFormatException e) {
                return null;
            }
        }

        // Combine the opcode and address to form the machine code
        return opcode + address;
    }
}

}
