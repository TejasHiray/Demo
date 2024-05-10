package Day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mapdemo1 {
    public static void main(String[] args) {
        List<Integer>l1= Arrays.asList(2,3,4,5);
        List<Integer>multiliedL2=new ArrayList<Integer>();
        l1.stream().map(num->num*3).forEach(System.out::println);

    }

}
