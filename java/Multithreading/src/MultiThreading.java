class Mythread1 extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("My thread is running");
            System.out.println("I am happy");
        }
    }
}
class Mythread2 extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread 2 is good");
            System.out.println(" ");

        }
    }



}

public class MultiThreading {
    public static void main(String[] args) {
        Mythread1 t1=new Mythread1();
        Mythread2 t2=new Mythread2();
        t1.start();
        t2.start();
    }


}
