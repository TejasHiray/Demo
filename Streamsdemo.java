package Day13;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streamsdemo {
    public static void main(String[] args) {
//        ArrayList<Integer>l1=new ArrayList<Integer>();
//        l1.add(10);
//        l1.add(20);
//        l1.add(30);
//        System.out.println(l1);



        List<Integer>l1= Arrays.asList(10,35,20,25,30);
        List<Integer>evenValuesList=new ArrayList<Integer>();

        evenValuesList=l1.stream().filter(n->n%2==0).collect(Collectors.toList());

        System.out.println(l1);
        System.out.println(evenValuesList);

        l1.stream().filter(n->n%2==0).forEach(n-> System.out.println());

        List<String>n=Arrays.asList("A","B","C","DE");
        List<String>names=new ArrayList<>();

        n.stream().filter(str->str.length()>6 && str.length()<8).forEach(System.out::println);


        List<String>words = Arrays.asList("Cup",null,"forest","sky","book",null,"theatre");

        List<String>result=words.stream().filter(w-> w!=null).collect(Collectors.toList());
        System.out.println(result);
}
}
