import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class DzTask_05 {
    public static void main(String[] args) {
        HashMap<String, String> tel = new HashMap<>();
        tel.merge("lol", "12345", (old, n) -> old + ";" + n);
        tel.merge("lol", "9875645", (old, n) -> old + ";" + n);
        tel.merge("pop", "9875645", (old, n) -> old + ";" + n);
        tel.merge("ted", "9875645", (old, n) -> old + ";" + n);
        tel.merge("pop", "9875645", (old, n) -> old + ";" + n);
        System.out.println(tel);
        ArrayList<String> l = new ArrayList<>();
        l.addAll(tel.keySet());
        l.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return tel.get(o1).split(";").length - tel.get(o2).split(";").length;
            }
        });
        System.out.println(l);


    }


            }
























