package MiniActivity;


import java.util.Arrays;
import java.util.Optional;


public class Task4 {
    public static void main(String[] args) {

        String[] names = {"Amit", "Bhavya", "Chetan", "Deepak", "Ekta", "Farhan", "Gita", "Harsh", "Isha", "Jyoti"};

        Optional<String> result = Arrays.stream(names)
                .filter(name -> name.length() == 5)
                .findAny();

        System.out.println(result);


    }
}




