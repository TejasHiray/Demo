
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class CodingActivity1 {
    public static void main(String[] args) {
        String[] names={"Amit", "Bhavya", "Chetan", "Deepak", "Ekta", "Farhan", "Gita", "Harsh", "Isha", "Jyoti"};
        List<String> n1 = Arrays.asList(names);

        //Count the number
        long l1=n1.stream()
                .filter(name->name.length()>5)
                .count();
        System.out.println("number of names is "+ l1);


        //find name of 5 words
        String l2=n1.stream()
                .filter(name->name.length()==5)
                .findAny()
                .orElse(null);
        System.out.println("5 charcters:"+l2);


//        Map<Character, List<String>> namesByFirstCharacter = names.stream()
//                .collect(Collectors.groupingBy(name -> name.charAt(0)));
//        System.out.println("Names grouped by first character: " + namesByFirstCharacter);
//
//
//        //Sort the name in ascending order
//        List<String> sortedNames = names.stream()
//                .sorted(String.CASE_INSENSITIVE_ORDER)
//                .collect(Collectors.toList());
//        System.out.println("Sorted names :" + sortedNames);






    }

}
