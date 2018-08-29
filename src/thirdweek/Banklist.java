package thirdweek;

/**
 * Created by expert on 7/10/18.
 */
public class Banklist {

    String name; String branch; int ifsc,ano; String aname; int abal;

    public Banklist(String name,String branch,int ifsc,int ano,String aname,int abal){
        this.name=name;
        this.ifsc=ifsc;
        this.branch=branch;
        this.ano = ano;
        this.aname = aname;
        this.abal = abal;
    }
}
