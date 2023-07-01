import java.util.HashMap;
import java.util.Iterator;


public class Task_6 {
    public static void main(String[] args) {
        Set<Integer> lol = new Set();
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
        System.out.println((lol.toString()));
    }
}
class Set<E> {
    private HashMap<E, Object> set = new HashMap<>();
    private static final Object OBJECT = new Object();
    public boolean add(E v) {
        return set.put(v, OBJECT) == null;
    }
    public boolean remove(E v) {
        return set.remove(v) == OBJECT;
    }
    public int size() {
        return set.size();
    }
    public boolean isEmpty() {
        return set.isEmpty();
    }
    public Iterator<E> iterator() {
        return set.keySet().iterator();
    }
    public void clear() {
        set.clear();
    }


}