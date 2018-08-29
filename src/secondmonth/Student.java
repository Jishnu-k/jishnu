package secondmonth;

import java.lang.reflect.Method;

/**
 * Created by expert on 8/27/18.
 */
public class Student {

    @College(name="SH college",location="Tevara")
    public void getInfo(){
    }

    @College(name="ABC college",location = "Tvm")
    public void getData(){

    }


    public static void main(String[] args){
        try{
            Method m=Student.class.getMethod("getInfo");
            Method s=Student.class.getMethod("getData");
            College collegeAnnotation=(College)m.getAnnotation(College.class);
            College cn=(College)s.getAnnotation(College.class);
            if(collegeAnnotation!=null){
                System.out.println("Name:"+collegeAnnotation.name());
                System.out.println("location:"+collegeAnnotation.location());
                System.out.println("----------------------------------");
                System.out.println("Name:"+cn.name());
                System.out.println("location:"+cn.location());
            }
        }catch (NoSuchMethodException e){
            System.out.println("NoSuchMethodException");
        }
    }
}
