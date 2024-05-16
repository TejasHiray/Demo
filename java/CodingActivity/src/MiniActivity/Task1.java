package MiniActivity;

import java.util.List;
import java.util.stream.Collectors;


public class Task1 {
    public static void main(String[] args) {

        //Sort the name in ascending order
        List<String> names = List.of("Amit", "Bhavya", "Chetan", "Deepak", "Ekta", "Farhan", "Gita", "Harsh", "Isha", "Jyoti");
        List<String> sortedNames = names.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());
        System.out.println("Sorted names :" + sortedNames);






    }

}
