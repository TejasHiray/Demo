

class MyThreadRunnable1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Here is My java code");
    }
}
class MyThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Here is my java code2");
    }
}

public class MultiThreading2 {
    public static void main(String[] args) {
        MyThreadRunnable1 l1=new MyThreadRunnable1();
        Thread a1=new Thread(l1);

        MyThreadRunnable2 l2=new MyThreadRunnable2();
        Thread a2=new Thread(l2);

        a1.start();
        a2.start();
    }



}
