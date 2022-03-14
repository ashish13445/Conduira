import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Program1 implements Runnable{
    String string;
    Program1(String str){
        string = str;
    }
    @Override
    public void run(){
        System.out.println("the task name: " + string + " is in progress by thread " + Thread.currentThread().getName() );
    }

}


class Main{
    public static  void main(String[] args){
        Runnable thread1 = new Program1("task1");
        Runnable thread2 = new Program1("task2");
        Runnable thread3 = new Program1("task3");
        Runnable thread4 = new Program1("task4");
        Runnable thread5 = new Program1("task5");
        Runnable thread6 = new Program1("task6");


        ExecutorService ex = Executors.newFixedThreadPool(2);
        ex.execute(thread1);
        ex.execute(thread2);
        ex.execute(thread3);
        ex.execute(thread4);
        ex.execute(thread5);
        ex.execute(thread6);
       ex.shutdown();
    }
}
