package Day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapdemo2 {
    public static void main(String[] args) {
        List<String>vehicle= Arrays.asList("bus","car","bicycle","flight");
        List<String>vehicleListinUpperCase=new ArrayList<String>();

//find the length
        vehicle.stream().map(vname->vname.length()).forEach(len-> System.out.println(len));

//        for (String name:vehicle){
//            vehicleListinUpperCase.add(name.toUpperCase());
//        }

//convert it into uppercase
        vehicleListinUpperCase=vehicle.stream().map(name->name.toUpperCase()).collect(Collectors.toList());

        System.out.println(vehicleListinUpperCase);







    }

}
