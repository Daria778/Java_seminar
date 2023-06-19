import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first string: ");
            String sym = scanner.nextLine();
            System.out.print("Enter the second string: ");
            String sym1 = scanner.nextLine();
            if (sym.equals(sym1)) {
                System.out.println("Strings are same");
            } else {
                System.out.println("Strings are different");
            }

    }
}
