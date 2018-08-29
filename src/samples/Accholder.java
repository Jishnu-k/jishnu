package samples;

/**
 * Created by expert on 7/4/18.
 */
public class Accholder extends Bank{

    int abal;
    int ano;
    String aname;

    public Accholder(String name,String branch,int ifsc,int ano,String aname,int abal){
        super(name,branch,ifsc);
        this.ano=ano;
        this.aname=aname;
        this.abal=abal;
    }

    public static void deposit(int no,int dep,Accholder arr[]){
        for (Accholder obj:arr) {
            if(obj.ano==no)
                obj.abal+=dep;
        }

    }

    public static void retrieve(int no,int ret,Accholder arr[]){
        for(Accholder obj:arr){
            if(obj.ano==no)
                obj.abal-=ret;
        }

    }

    public void display(){
        System.out.println(name+" "+branch+" "+ifsc+" "+ano+" "+aname+" "+abal);
    }

    public static void main(String[] args) {
        Accholder a1=new Accholder("sbi","kochi",123,1,"jishnu",1000);
        Accholder a2=new Accholder("south","tvmala",456,2,"aswanth",4000);
        Accholder a3=new Accholder("axis","pknagar",789,3,"ashok",3000);
        Accholder arr[]={a1,a2,a3};
        deposit(1,500,arr);
        retrieve(2,500,arr);
        a1.display();
        a2.display();
        a3.display();

    }

}
