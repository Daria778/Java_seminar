import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

public class DzTask_03 {
    public static void main(String[] args) {

        ArrayList <Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            arr.add(new Random().nextInt(100));
        }

        Iterator<Integer> lol = arr.iterator();
        while (lol.hasNext()) {
            if (lol.next() % 2 == 0)
                lol.remove();
        }

        arr.sort(Comparator.naturalOrder());
        System.out.println(arr);
        int min = arr.get(0);
        int max = arr.get(arr.size() - 1);
        System.out.println(min);
        System.out.println(max);

        int s = 0;
        for (int i = 0; i < arr.size(); i++) {
            s += arr.get(i);
        }
        System.out.println(s);
        int e = s / arr.size();
        System.out.println(e);
    }
}
