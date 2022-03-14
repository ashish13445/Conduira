public class ThreadByRunnableInterface implements Runnable{
    public void run(){
        System.out.println("Thread name is " + Thread.currentThread().getName());
    }
}

class Main{
    public static void main(String[] args){
        ThreadByRunnableInterface obj = new ThreadByRunnableInterface();
        Thread t1 = new Thread(obj);
        t1.setName("My Thread");
        t1.start();
    }
}
