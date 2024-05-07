import java.util.ArrayList;
public class Arraylists2 {
    public static void main(String[] args) {



//example 1 (adding example)

//        ArrayList<String> colors=new ArrayList<>();

//        colors.add("Blue");
//        colors.add("Green");
//        colors.add("Blue");
//
//        System.out.println(colors);



//example 2

//        ArrayList<Integer> numbers=new ArrayList<>();
//        numbers.add(20);
//        numbers.add(30);
//        numbers.add(50);
//
//        int secondNumber=numbers.get(1);
//        System.out.println(secondNumber);






        //example 3 (changing the elements)


//     ArrayList<String>a1=new ArrayList<>();
//
//     a1.add("Welcome");
//     a1.add("Home");
//
//     a1.add(1,"Back");
//        System.out.println(a1);
//
//        a1.set(1,"dear");
//
//        System.out.println(a1);




        //example 4 (removing elements)


//        ArrayList<String>l1=new ArrayList<>();
//
//        l1.add("Welcome");
//        l1.add("home");
//
//
//        l1.add("back");
//
//
//        System.out.println(l1);
//
//        l1.remove(1);
//
//        System.out.println(l1);
//
//        l1.remove("home");
//
//        System.out.println(l1);



        // example 5 (Get elements)

//        ArrayList<Integer>l1=new ArrayList<>();
//        l1.add(10);
//        l1.add(12);
//        l1.add(14);
//        System.out.println(l1);
//
//        Integer n=l1.get(1);
//        System.out.println(n);

        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean> list3=new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        int element=list.get(0);
        System.out.println(element);

        list.add(1,2);
        System.out.println(list);

        list.set(0,0);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        int size=list.size();
        System.out.println(size);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+" ");
        }
        System.out.println();

        list.add(0);

        System.out.println(list);

    }
}




