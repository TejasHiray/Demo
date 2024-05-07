//class Animal{
//    void eat(){
//        System.out.println("Dog in eating ");
//
//    }
//}
//class Dog extends Animal{
//    void bark(){
//        System.out.println("Dog is barking");
//    }
//}
class Vehicle{
    void running(){
        System.out.println("Car is running");
    }
}
class Car extends Vehicle {
    void openDoor() {
        System.out.println("Car door is opening");

    }
}
class Sportscar extends Vehicle{
    void accelerate(){
        System.out.println("Sports car is accelerating");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Sportscar s=new Sportscar();
        s.accelerate();
        s.running();

        Car c=new Car();
        c.openDoor();
        c.running();

    }




}
