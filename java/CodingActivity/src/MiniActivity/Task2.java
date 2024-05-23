package MiniActivity;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String[] n1 = {"Amit", "Bhavya", "Chetan", "Deepak", "Ekta", "Farhan", "Gita", "Harsh", "Isha", "Jyoti"};

        long count = Arrays.stream(n1)
                .filter(name -> name.length() > 5)
                .count();

        System.out.println("Number of names : " + count);
    }
}

