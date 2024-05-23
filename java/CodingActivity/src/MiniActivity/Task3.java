package MiniActivity;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        String[] n1 = {"Amit", "Bhavya", "Chetan", "Deepak", "Ekta", "Farhan", "Gita", "Harsh", "Isha", "Jyoti"};

        Map<Character, String> groupedNames = Arrays.stream(n1)
                .collect(Collectors.groupingBy(name -> name.charAt(0),
                        Collectors.joining(", ")));

        System.out.println("Names grouped by first character:");
        groupedNames.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}


