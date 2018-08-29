package thirdweek;

import java.io.IOException;

/**
 * Created by expert on 7/9/18.
 */
public class callcheck {

        public static void check()throws IOException,ClassNotFoundException {

            throw new IOException();

        }

        public static void callcheck() throws IOException, ClassNotFoundException //compile will stop here if "throws" is not given
        { check();
        }

        public static void main(String[] args) {
            try{
                callcheck();
            }catch(Exception e){
                //e.printStackTrace
                System.out.println("Checked Exception");
            }
        }
    }

