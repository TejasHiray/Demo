// class Pen{
//     String color;
//     String type;

//     public void write(){
//         System.out.println("writting something");
//     }
//     public void printColor(){
//         System.out.println(this.color);
//     }
    
// }
// public class oops{
//     public static void main(String args[]){
//         Pen pen1 = new Pen();
//         pen1.color = "blue";
//         pen1.type = "gel";

//         Pen pen2 = new Pen();
//         pen2.color = "black";
//         pen2.type = "ballpen";

//         pen1.printColor();
//         pen2.printColor();


//     }
// }

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
         
    }
}
public class oops{
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="tejas";
        s1.age=23;

        s1.printInfo();
    }
}