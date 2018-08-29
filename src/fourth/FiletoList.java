package fourth;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;

public class FiletoList {
    public static void main(String[] args) throws IOException{

        FileWriter fout=new FileWriter("List.txt");
        fout.write("This is sparta");
        fout.close();
        FileReader fin=new FileReader("List.txt");

        ArrayList<String> al=new ArrayList<>();
        BufferedReader reader=new BufferedReader(new FileReader("List.txt"));
        String s=reader.readLine();
        String[] a=s.split(" ");
//        for(int i=0;i<3;i++)
//            al.add(a[i]);

        for(String o:a)
            al.add(o);

        for(String o:al){
            System.out.println(o);
        }

    }
}
