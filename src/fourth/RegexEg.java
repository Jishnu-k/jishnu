package fourth;

import java.util.regex.Pattern;

/**
 * Created by expert on 7/19/18.
 */
public class RegexEg {
    public static void main(String[] args) {

        boolean b= Pattern.matches(".b","abb");
        boolean c= Pattern.matches("..b","abbc");
        boolean d= Pattern.matches("..b","abb");
        System.out.println(Pattern.matches("[abc]","aaa"));
        System.out.println(Pattern.matches("[^abc]","z"));
        System.out.println(Pattern.matches("[a-zA-Z]","A"));
        System.out.println(Pattern.matches("[a-z]","a"));
        System.out.println(Pattern.matches("[a-d][m-p]","am"));
        System.out.println(Pattern.matches("[a-d[m-p]]","am"));
        System.out.println(Pattern.matches("[a-d][m-p]]","ma"));
        System.out.println(Pattern.matches("[a-d][m-p]","a"));
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
