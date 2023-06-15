import java.util.Random;
public class DzTask_01 {
    static int num() {
         return new Random().nextInt(2000);
    }

    public static void main(String[] args) {
        int i = num();
        System.out.println(i);
    }
}
