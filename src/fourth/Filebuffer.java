package fourth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by expert on 7/18/18.
 */
public class Filebuffer {
    public static void main(String[] args) throws IOException{

        System.out.println("Enter line");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s=reader.readLine();
        System.out.println(s);
    }
}
