
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        System.out.println("Add a number type \"end\" to finish");
        List<Integer> numbers = new ArrayList<>();
        
        while (true) {
            String read = scanner.nextLine();
            
            if (read.equals("end")) {
                break;
            }           
            numbers.add(Integer.valueOf(read));
        }
        System.out.println(positive(numbers));
    }
    
    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
                      .filter(val -> val > 0)
                      .collect(Collectors.toCollection(ArrayList::new));
    }
}
