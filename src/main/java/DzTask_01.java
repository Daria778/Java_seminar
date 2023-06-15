import java.util.Random;
public class DzTask_01 {
    static int num() {
         return new Random().nextInt(2000);
    }
    static int nsz(int arg) {
        return Integer.toBinaryString(arg).length();
    }
 
    static int[] fjf(int arg, int arg1) {                            //arg - рандомное число i
        int[] array = new int[1000000000];                           //arg1 - число n
        int j = 0;
        for (int i = arg; i < Short.MAX_VALUE; i++) {
            if (i % arg1 == 0) {
                array[j] = i;
                j++;
            }
        }
        return array;
    }
    static int[] pop(int arg, int arg1) {
        int[] array = new int[1000000000];
        int j = 0;
        for (int i = Short.MIN_VALUE; i < arg; i++) {
            if (i % arg1 != 0) {
                array[j] = i;
                j++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int i = num();
        System.out.println(i);
        int n = nsz(i);
        System.out.println(n);
        System.out.println(Short.MIN_VALUE);
        int[] m1 = fjf(i, n);
        int[] m2 = pop(i, n);


    }
}
