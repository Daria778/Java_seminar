import java.util.Scanner;
public class DzTask_02 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     //Вводятся значения из задачи
        System.out.print("Enter the surname: ");
        String surname = scanner.nextLine();
        System.out.print("Enter the mark: ");
        String mark = scanner.nextLine();
        System.out.print("Enter the subject: ");
        String subject =scanner.nextLine();
        String str = "Студент" + " " + surname + " " + "получил" + " " + mark + " " + "по предемету" + " " + subject;
        System.out.println(str);

    }
}