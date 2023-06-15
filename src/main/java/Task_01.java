import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        String sym = scanner.nextLine();
        System.out.print("Enter the second number: ");
        String sym1 = scanner.nextLine();
        System.out.print("Enter the sign: ");
        String sign = scanner.nextLine();

        switch (sign) {
            case "+":
                int res = Integer.parseInt(sym) + Integer.parseInt(sym1);
                System.out.println(res);
                break;
            case "-":
                 res = Integer.parseInt(sym) - Integer.parseInt(sym1);
                 System.out.println(res);
                 break;
            case "/":
                res = Integer.parseInt(sym) / Integer.parseInt(sym1);
                System.out.println(res);
                break;
            case "*":
                res = Integer.parseInt(sym) * Integer.parseInt(sym1);
                System.out.println(res);
                break;
            case "tbs":
                System.out.print(Integer.toBinaryString(Integer.parseInt(sym1)));
                break;
            default:
                System.out.println("The action is not supported");
        }
    }
}
