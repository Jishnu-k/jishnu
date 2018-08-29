package onemonth;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by expert on 8/13/18.
 */
public class studentmain {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("filesample.txt"));
        String str;
        ArrayList<studentfile> li=new ArrayList();
        while((str=br.readLine())!=null){
            String[] x=str.split(",");
            li.add(new studentfile(Integer.parseInt(x[0]),x[1],Integer.parseInt(x[2])));
        }
        for(studentfile list:li){
            System.out.println(" Id "+list.id+" Name "+list.name+" Mark "+list.mark);
        }


    }
}
