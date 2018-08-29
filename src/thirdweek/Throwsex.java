package thirdweek;

/**
 * Created by expert on 7/9/18.
 */

import java.io.IOException;

public class Throwsex {

    public static void check()throws IOException {

        throw new IOException();

    }

    public static void main(String[] args) {
        try{
            check();
        }catch(IOException e){
            //e.printStackTrace
            System.out.println("Checked Exception");
        }
    }
}
