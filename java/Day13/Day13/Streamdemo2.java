package Day13;
import java.util.ArrayList;
import java.util.List;

class Product{
    int id;
    String name;
    double price;
    public Product(int id,String name,double price)
    {
        this.id=id;
        this.name=name;
        this.price=price;
    }

}

public class Streamdemo2 {
    public static void main(String[] args) {
        List<Product>List=new ArrayList<Product>();
        List.add(new Product(1,"Samsung Mobile",35000));
        List.add(new Product(2,"Xiomi Mobile",20000));
        List.add(new Product(3,"Realme Mobile",25000));

        List.stream()
                .filter(p->p.price>23000)
                .forEach(pr-> System.out.println("Mobiles Price-"+pr.price));


    }

}
