import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public class DzTask_06 {
    public static void main(String[] args) {
        HashSet<Integer> lol = new HashSet();
        lol.add(1);
        lol.remove(1);
        System.out.println(lol.size());
        System.out.println(lol.isEmpty());
        for (int i = 0; i < 7; i++) {
            lol.add(i);
        }
        Iterator<Integer> it = lol.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        };


        lol.to_String();


    }
}
class HashSet<Integer> {
    private HashMap<Integer, Object> set = new HashMap<>();
    private static final Object OBJECT = new Object();
    public boolean add(Integer v) {
        return set.put(v, OBJECT) == null;
    }
    public boolean remove(Integer v) {
        return set.remove(v) == OBJECT;
    }
    public int size() {
        return set.size();
    }
    public boolean isEmpty() {
        return set.isEmpty();
    }
    public Iterator<Integer> iterator() {
        return set.keySet().iterator();
    }
    public void clear() {
        set.clear();
    }
    public void to_String() {
        System.out.println(set.keySet());
    }

}