public class App  extends Thread{
    @Override
    public void run(){
        System.out.println("Thread Name is " + Thread.currentThread().getName());
    }
}

class Main{
    public static void main(String[] args){
        App t1 = new App();
        t1.setName("My Thread");
        t1.start();
    }
}
