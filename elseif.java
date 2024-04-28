import java.util.Scanner;
public class elseif {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");

        Scanner sc=new Scanner(System.in);
        age= sc.nextInt();
//        if (age>50){
//            System.out.println("You are experienced");
//
//        }
//        else if(age>55){
//            System.out.println("you r to much experienced");
//
//        }
//        else if(age>60){
//            System.out.println("You r much more experienced");
//        }
//        else{
//            System.out.println("you are not experienced");
//        }

        switch(age){
            case 18:
                System.out.println("You are matured");
                break;
            case 23:
                System.out.println("You are passes out");
                break;
            case 60:
                System.out.println("You r gonna retired ");
                break;
            default:
                System.out.println("enjoy");

        }
        System.out.println("Thank you!!");

    }
}
