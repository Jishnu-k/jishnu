package samples;

/**
 * Created by expert on 7/6/18.
 */
public class Exceptioneg {

    public static void main(String[] args) {

        String s=null;

        try{
           s.length();
            System.out.println("sample print");  //won't execute bcoz of above exception
            int y=2/0;
        }catch(ArithmeticException p){
            System.out.println("Exception occured");
        }
        catch(NullPointerException e){
            System.out.println("null pointer exception");
        }
        finally{
            System.out.println("finally1");
        }

        try{
            int y=2/0;
            s.length();
        }catch(ArithmeticException p){
            System.out.println("Exception occured");
        }
        catch(NullPointerException e){
            System.out.println("null pointer exception");
        }

        try{
            int x=0/4;
        } catch (Exception e){
            System.out.println("Exception catch");
        }finally{
            System.out.println("finally2");
        }

        //exception occured or not, finally will execute

        System.out.println("rest of the code");
    }
}
