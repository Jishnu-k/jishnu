package samples;
import java.util.*;
/**
 * Created by expert on 7/2/18.
 */
public class arrayconsole {


    void display(String str[]){
        for(int i=0;i<5;i++)
            System.out.println(str[i]+" ");
    }

    public static void main(String[] args) {
        arrayconsole ac=new arrayconsole();
        Scanner sc=new Scanner(System.in);
        String str[]=new String[5];
        for(int i=0;i<5;i++)
        str[i]=sc.nextLine();
        ac.display(str);


    }
}
