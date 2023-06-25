import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class DzTask_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("The amount of people is: ");
        int num = Integer.parseInt(scanner.nextLine());
        ArrayList<String> people = new ArrayList<>();


        for (int i = 0; i < num; i++) {
            System.out.print("Enter the surname: ");
            String surname1 = scanner.nextLine();
            System.out.print("Enter the name: ");
            String name1 = scanner.nextLine();
            System.out.print("Enter the patronymic: ");
            String patronymic1 = scanner.nextLine();
            System.out.print("Enter the sex: ");
            String sex1 = scanner.nextLine();
            System.out.print("Enter the age: ");
            String age1 = scanner.nextLine();
            String human = surname1 + " " + name1 + " " + patronymic1 + " " + age1 + " " + sex1;
            people.add(human);
        }
        for (int i = 0; i < people.size(); i++) {
            String[] n = people.get(i).split(" ");
        }
        System.out.println("Enter 'q' to escape or enter 's' to sort");
        String v = scanner.nextLine();
        if (v.equals("q")) {
            System.out.println();
        } else if (v.equals("s")) {
            people.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return Integer.parseInt(o1.split(" ")[3]) - Integer.parseInt(o2.split(" ")[3]);
                }
            });


            for (int i = 0; i < people.size(); i++) {
                String[] n = people.get(i).split(" ");
                System.out.println(n[0] + " " + n[1].charAt(0) + "." + n[2].charAt(0) + "." + n[3] + " " + n[4]);

            }
        }
    }
}