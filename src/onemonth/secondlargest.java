package onemonth;

/**
 * Created by expert on 8/14/18.
 */
public class secondlargest {
    public static void main(String[] args) {
        int[] a = {1, 78, 23, 10, 34, 99, 54, 6};
        int first = a[0];
        for (int i = 0; i < 8; i++) {
            if (a[i] > first) {
                first = a[i];
            }
        }
        System.out.println("first " + first);
        int t = a[0];
        for (int i = 0; i < 8; i++) {
            if (a[i] < first) {
                for (i = 0; i < 8; i++) {
                    if (a[i] != first) {
                        if (a[i] > t) {
                            t = a[i];
                        }
                    }
                }
            }
    }
        System.out.println("Second " + t);
    }
}
