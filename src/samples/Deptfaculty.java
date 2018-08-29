package samples;

/**
 * Created by expert on 7/4/18.
 */
public class Deptfaculty extends Department{

    int facid;
    String fname;

    public Deptfaculty(int deptid,String deptname,int facid,String fname){
        super(deptid,deptname);
        this.facid=facid;
        this.fname=fname;
    }

    public void printdetails(){
        System.out.println("Dept id="+super.deptid+"\t Dept name="+super.deptname+"\t Facid="+facid+"\t Name="+fname);
    }

    public static void main(String[] args) {
        Deptfaculty f=new Deptfaculty(1,"anju",2,"jishnu");
        f.printdetails();
    }
}
