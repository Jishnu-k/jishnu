package fourth;

import java.util.regex.Pattern;

/**
 * Created by expert on 7/20/18.
 */
public class RegexEx1 {
    public static void main(String[] args) {

        System.out.println(Pattern.matches("[\\D]{6}","aaaaaa"));
        System.out.println(Pattern.matches("[@&%]","@"));
        System.out.println(Pattern.matches("[12][a-zA-Z0-9]*","2shffD988"));
        System.out.println(Pattern.matches("[a-z0-9#$%^]+[@][a-z0-9]+[.][c][o][m]","jishnu123@gmail.com"));
        System.out.println(Pattern.matches("[+][9][1][0-9]{10}","+911234567891"));
        System.out.println(Pattern.matches("[[a-z0-9]+[a-z]+[0-9]+]{10}","aassssss99"));

    }
}
