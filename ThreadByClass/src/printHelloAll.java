public class printHelloAll extends Thread{
public void run(){
    System.out.println("Hello All");
}
}

class Main{
    public static void main(String[] args){
        printHelloAll print = new printHelloAll();
        Thread t1 = new Thread(print);
        Thread t2 = new Thread(print);
        Thread t3 = new Thread(print);
        Thread t4 = new Thread(print);
        Thread t5 = new Thread(print);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}