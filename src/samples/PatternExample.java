package samples;

import java.util.regex.Pattern;

/**
 * Created by expert on 6/29/18.
 */

public class PatternExample {
int n,i,j;

    void print(int n)
    {

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PatternExample p=new PatternExample();
        p.print(5);
    }
}
