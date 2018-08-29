package thirdweek;

/**
 * Created by expert on 7/9/18.
 */
import java.util.Arrays;
import java.util.StringTokenizer;

public class Arraysex {
    public static void main(String[] args) {
        int[] a={9,2,6,1};
        Arrays.sort(a);
        System.out.println("element is at"+Arrays.binarySearch(a,6));
        for (int x:a) {
            System.out.println(x);
        }

        String s="acbd";
        char[] ch=s.toCharArray();
        for(char o:ch){
            System.out.println(o);
        }

        String str="abc,bav,hss";

        StringTokenizer s1=new StringTokenizer(str,",");
        while (s1.hasMoreTokens())
            System.out.println(s1);
    }

}
