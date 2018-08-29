package thirdweek;

import java.util.ArrayList;
import java.util.Iterator;

public class Employeemain {

    public static void main(String[] args) {

        Employee emp1=new Employee("jishnu",1000,"cse");
        Employee emp2=new Employee("aswanth",5000,"eee");
        ArrayList<Employee> al=new ArrayList<>();
        al.add(emp1);
        al.add(emp2);


        for(Employee obj:al){
            System.out.println(obj.empname+obj.salary+obj.dept);
        }



        Iterator itr=al.iterator();
        while(itr.hasNext()) {
            Employee obj=(Employee) itr.next();
            System.out.println(obj.empname+" "+obj.salary+" "+obj.dept);
        }
    }
}