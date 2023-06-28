import java.util.HashMap;

public class DzTask_05 {
    public static void main(String[] args) {
        HashMap<String, String> tel = new HashMap<>();
        tel.merge("lol", "12345", (old, n) -> old + ";" + n);
        tel.merge("lol", "9875645", (old, n) -> old + ";" + n);
        System.out.println(tel);
            }
        }



