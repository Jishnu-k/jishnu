package fifth;

/**
 * Created by expert on 7/24/18.
 */
public class GarbageEx
{
    @Override
    protected void finalize()
    {
        System.out.println("Before garbage collection");
    }
    int x;

    public static void main(String[] args)
    {
        //System.gc();
        GarbageEx g1=new GarbageEx();
        g1=null;
        GarbageEx g2=new GarbageEx();
        g2=null;
        System.gc();
    }
}
