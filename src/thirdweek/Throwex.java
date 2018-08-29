package thirdweek;

/**
 * Created by expert on 7/9/18.
 */
public class Throwex {
    public static void add(int x,int y){

        int z=x+y;
        if(z>50){

            throw new ArithmeticException("not valid"); //create customised exception

        }
    }

    public static void main(String[] args) {
        //try{
        add(40,30);
        //} catch(Exception e){
        //System.out.println("Exception caught");
        //}
    }
}
