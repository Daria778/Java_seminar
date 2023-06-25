import java.util.ArrayList;
import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the surname: ");
        String surname = scanner.nextLine();
        System.out.print("Enter the name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the patronymic: ");
        String patronymic = scanner.nextLine();
        System.out.print("Enter the sex: ");
        String sex = scanner.nextLine();
        System.out.print("Enter the age: ");
        String age = scanner.nextLine();


        ArrayList <String> people= new ArrayList<>();
        people.add(surname);
        people.add(name);
        people.add(patronymic);
        people.add(sex);
        people.add(age);
        System.out.printf("%s %s. %s. %s, %s", surname, name.charAt(0), patronymic.charAt(0), age, sex);
    }
}
