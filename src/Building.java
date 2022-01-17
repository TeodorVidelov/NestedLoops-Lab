import java.util.Scanner;
public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countFloors = Integer.parseInt(scanner.nextLine());
        int countRooms = Integer.parseInt(scanner.nextLine());

        for (int floors = countFloors; floors >= 1; floors--) {
            for (int rooms = 0; rooms < countRooms; rooms++) {
                String officeOrApartment = "";
                if (floors == countFloors){
                    officeOrApartment = "L";
                }
                else if (floors % 2 == 0){
                    officeOrApartment = "O";
                }
                else {
                    officeOrApartment = "A";
                }
                System.out.printf("%s%d%d ",officeOrApartment,floors,rooms);
            }
            System.out.println();
        }
    }
}