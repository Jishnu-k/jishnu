package fourth;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by expert on 7/18/18.
 */
public class Filewriterchar {
    public static void main(String[] args) throws IOException{

        FileWriter fout=new FileWriter("second.txt");
        fout.write("hello world");
        fout.close();

        FileReader fin=new FileReader("second.txt");
        int ch=0;
        while((ch=fin.read())!=-1){
            System.out.print((char)ch);
        }

    }
}
