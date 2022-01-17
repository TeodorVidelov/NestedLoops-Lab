import java.util.Scanner;
public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int countCombinations = 0;

        for (int n1 = 0; n1 <= number; n1++) {
            for (int n2 = 0; n2 <= number; n2++) {
                for (int n3 = 0; n3 <= number; n3++) {
                    int result = n1 + n2 + n3;
                    if (result == number){
                        countCombinations++;
                    }
                }
            }
        }
        System.out.println(countCombinations);
    }
}