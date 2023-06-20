import java.util.Scanner;
public class DzTask_02 {
    static void lol() {
        StringBuilder lol = new StringBuilder(77);
        String filter = "name : Ivanov, country : Russia, city : Moscow, age : null";
        filter = filter.replace(":", "=");
        lol.append("filter : ").append(filter);
        System.out.println(lol);
    }

    static StringBuilder joke() {
        Scanner scanner = new Scanner(System.in);     //Вводятся значения из задачи
        System.out.print("Enter the surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter the mark: ");
        String mark = scanner.nextLine();

        System.out.print("Enter the subject: ");
        String subject =scanner.nextLine();

        StringBuilder str = new StringBuilder(90);
        str.append("Студент ").append(surname).append(" получил ").append(mark).append(" по предмету ").append(subject).append(".");
        return str;
    }
    static void method() {
        String s = "";
        StringBuilder builder1 = new StringBuilder("");

        for (int i = 0; i < 1011; i++) {
            s += "a";
        }
        for (int i = 0; i < 1011; i++) {
            builder1.append("a");
        }
        long start = System.currentTimeMillis();
        s = s.replace("a", "A");
        System.out.println("String time = " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        StringBuilder lol = new StringBuilder("");
        for (int i = 0; i < 1011; i++) {
            lol.append("A");
        }
        builder1 = lol;
        System.out.println("StringBuilder time = " + (System.currentTimeMillis() - start));

    }


    public static void main(String[] args) {

        System.out.println(joke());
        lol();
        method();

        String str =  ".3 + 1.85";


    }

    }
