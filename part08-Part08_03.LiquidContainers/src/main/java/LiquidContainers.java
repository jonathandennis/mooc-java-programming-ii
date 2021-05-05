
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int first = 0;
        int second = 0;

        while (true) {
            System.out.print("First: " + first + "/100\n"
                            + "Second: " + second + "/100\n"
                            + "> ");

            String input = scan.nextLine();
                        
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add") && amount > 0) {

                first += amount;
                    
                if (first > 100) {
                    first = 100;
                }                
            }
            
            if (command.equals("move") && amount > 0) {
                               
                if (amount > first) {
                    amount = first;
                }
                
                first -= amount;
                second += amount; 
                              
                
                if (second > 100) {
                    second = 100;
                }
            }
            
            if (command.equals("remove") && amount > 0) {
                                           
                second -= amount;
                
                if (second < 0) {
                    second = 0;
                }
            }
        }
    }
}
