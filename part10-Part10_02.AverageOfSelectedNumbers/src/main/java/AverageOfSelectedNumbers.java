
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        
        System.out.println("Input numbers, type \"end\" to stop.");
        ArrayList<Integer> inputs = new ArrayList<>();
        
        while (true) {
            String row = scanner.nextLine();
            
            if (row.equals("end")) {
                break;
            }
            
            inputs.add(Integer.valueOf(row));
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        
        String selection = scanner.nextLine();
        
        if (selection.equals("p")) {
            System.out.println("Average of the positive numbers: "
                               +inputs.stream()
                               .mapToInt(n -> n)
                               .filter(num -> num > 0)
                               .average()
                               .getAsDouble());
        } else if (selection.equals("n")) {
            System.out.println("Average of the negative numbers: "
                               +inputs.stream()
                               .mapToInt(n -> n)
                               .filter(num -> num < 0)
                               .average()
                               .getAsDouble());
        }
    }
}
