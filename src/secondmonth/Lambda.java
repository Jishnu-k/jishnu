package secondmonth;

/**
 * Created by expert on 8/29/18.
 */

@FunctionalInterface //it is optional
interface Drawable{
    public void draw();
}

public class Lambda { //no need of 'implements'

    public static void main(String[] args) {
        int width=10;

        //with lambda
        Drawable d2=()->{
            System.out.println("Drawing "+width);  //definition of method draw
        };

        d2.draw();
    }
}
