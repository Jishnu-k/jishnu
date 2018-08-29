package samples;

/**
 * Created by expert on 7/2/18.
 */
public class marray {

    public static void main(String[] args) {
        int a[][] = {{1, 4, 3, 2}, {5, 8, 7, 6}};
        System.out.println("no of rows or its length \t"+a.length);
        System.out.println("no of columns \t"+a[0].length);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)  {
                for (int k = j + 1; k < a[i].length; k++) {
                    if (a[i][j] > a[i][k]) {
                        int t = a[i][j];
                        a[i][j] = a[i][k];
                        a[i][k] = t;
                    }

                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

