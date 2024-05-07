import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class List1 {

    public static void integers() {
        List<Integer> nums = new ArrayList<>();
        nums.add(15);
        nums.add(5);
        nums.add(7);
        nums.set(2, 9);

        System.out.println(nums);

        Scanner scan = new Scanner(System.in);
        System.out.println("Which serial value do you want to view ");
        Integer index = scan.nextInt() - 1;
        System.out.println("This is the value: " + nums.get(index));
    }

    public static void strings() {
        List<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        System.out.println(animals);
        animals.add(0, "Bear");
        System.out.println("Adding animal on first position " + animals);
        animals.set(2, "Lion");
        System.out.println("Adding lion instead of cat " + animals);

        Scanner scan = new Scanner(System.in);
        System.out.println("Which serial do you want to view ");
        Integer index = scan.nextInt() - 1;
        System.out.println("This is the value: " + animals.get(index));
    }

    public static void floats() {
        List<Float> cgpa = new ArrayList<>();
        System.out.println("Enter number of students whose cgpa you want to fill in ");
        Scanner scan = new Scanner(System.in);
        Integer inps = scan.nextInt();

        System.out.println("Enter CGPA roll number wise");
        //Float tempCgpa;
        for (Integer i = 0; i < inps; i++) {
            //tempCgpa = scan.nextFloat();
            cgpa.add(scan.nextFloat());
        }
        System.out.println("These are the cgpa's you entered " + cgpa);

        System.out.println("Enter roll number of student whose cgpa you want to view ");
        Integer roll = scan.nextInt();
        System.out.println("CGPA of roll number " + roll + ": " + cgpa.get(roll - 1));

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose one option from following to operate on: ");
        System.out.println("" + "\n 1. Basic numbers\n 2. Animals\n 3. CGPA of students" + "\n__");
        Integer choice = scan.nextInt();

        switch (choice) {
            case 1:
                integers();
            case 2:
                strings();
            case 3:
                floats();
            default:
                if (choice > 3)
                    System.out.println("Invalid choice, please choose from given options");
                else {
                    System.out.println("END");
                }


        }

    }
}
