package thirdweek;

import java.io.IOException;

/**
 * Created by expert on 7/9/18.
 */
public class UncheckedException {

    public static void first(){
        second();
    }
    public static void second(){

        third();
    }
    public static void third(){

        throw new ArithmeticException("exception");

    }

    public static void main(String[] args) {
        try{
            first();
        } catch(Exception e){
            System.out.println("Exception caught");
        }
    }
}
