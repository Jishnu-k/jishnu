package fourth;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by expert on 7/18/18.
 */
public class Filecopy {
    public static void main(String[] args) throws IOException{

        FileWriter fout=new FileWriter("orginal.txt");
        fout.write("copy file");
        fout.close();
        FileReader fin=new FileReader("orginal.txt");

        FileWriter foutc=new FileWriter("copy.txt");
        FileReader finc=new FileReader("copy.txt");

        int n=0;
        while((n=fin.read())!=-1) {
            foutc.write((char)n);
        }
        foutc.close();

        int ch=0;
        while((ch=finc.read())!=-1){
            System.out.print((char)ch);
        }



    }
}
