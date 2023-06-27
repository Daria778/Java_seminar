import java.util.HashMap;
import java.util.Random;

import static java.lang.Math.pow;

public class Task_05 {
    public static void main(String[] args) {
        HashMap <Integer, Integer> vc = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            vc.put(i, random.nextInt(10));

        }
        for (int i: vc.keySet()) {
            if (vc.get(i) % 3 == 0 & vc.get(i) != 0) {
                System.out.println(i + "-" + vc.get(i));
        }

            }
        HashMap <Integer, String> pl = new HashMap<>();
        HashMap <Integer, String> lp = new HashMap<>();
        for (int i = 0; i < 10 ; i++) {
            pl.put(random.nextInt(20), "lk");
        }
        System.out.println(pl);
        for (int i = 0; i < 10 ; i++) {
            lp.put(random.nextInt(20), "ml");
        }
        System.out.println(lp);
        for (int i :pl.keySet()) {
            if (lp.containsKey(i))
                    System.out.println(pl.get(i) + " " + lp.get(i));
                }

        HashMap<Integer, Integer> pop = new HashMap<>();
//        for (int i = 0; i < 10; i++) {
//            pop.put(i, (int) pow(random.nextInt(10), 2));
//        }
        for (int i = 0; i < 10; i++) {
            pop.put(i, random.nextInt(10));
        }
//        for (int i:pop.keySet()) {
//            System.out.println(i + "=" + pop.get(i)*pop.get(i));
//        }
        //pop.forEach((key, value) -> System.out.println(key + "=" + value * value));

        pop.replaceAll((key, value) -> value * value);
        System.out.println(pop);
            }

        }



