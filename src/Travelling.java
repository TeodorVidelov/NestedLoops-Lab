import java.util.Scanner;
public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!"End".equals(input)){
            String destination = input;
            double minimumBudget = Double.parseDouble(scanner.nextLine());
            double deposit = 0;

            while (deposit < minimumBudget){
                   deposit += Double.parseDouble(scanner.nextLine());
                }
            System.out.printf("Going to %s!\n",destination);
            input = scanner.nextLine();
        }
    }
}