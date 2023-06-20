import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first string: ");
            String sym = scanner.nextLine();
            System.out.print("Enter the second string: ");
            String sym1 = scanner.nextLine();
            StringBuilder sym2 = new StringBuilder(sym1).reverse();
            String lol = sym2.toString();

            if (sym.equals(lol)) {
                System.out.println("Strings are same");
            } else {
                System.out.println("Strings are different");
            }




        }

    }
