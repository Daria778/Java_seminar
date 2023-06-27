
import java.util.ArrayList;
import java.util.HashMap;

public class DzTask_05 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> tel = new HashMap<>();
        ArrayList<String[]> data = new ArrayList<>();
        data.add(new String[] {"lol", "12345"});
        data.add(new String[] {"lol", "23780"});
        tel.put(data.get(0)[0], new ArrayList<>());
        tel.get("lol").add(data.get(0)[1]);
        tel.get("lol").add(data.get(1)[1]);
        System.out.println(tel);
            }
        }



