package samples;

/**
 * Created by expert on 7/3/18.
 */
public class Product {

    int id,price;
    String name;

    public Product(int id, int price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public static void main(String[] args) {

        Product p1=new Product(1,500,"laptop");
        Product p2=new Product(2,1200,"phone");
        Product p3=new Product(3,900,"ipad");
        Product parray[]={p1,p2,p3};

        for (Product obj:parray){
            if(obj.price>1000)
                System.out.println(obj.id+"\t"+obj.price+"\t"+obj.name);

        }



    }
}
