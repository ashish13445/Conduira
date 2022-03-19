import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleThreadsByRunnableInterface implements Runnable{
    private final String message;
    public MultipleThreadsByRunnableInterface(String message){
        this.message = message;
    }
    @Override
    public void run() {
        System.out.println(message);
    }
}
class Main{
    public static void main(String[] args){
        MultipleThreadsByRunnableInterface print = new MultipleThreadsByRunnableInterface("Hello India");
        ExecutorService exe = Executors.newFixedThreadPool(5);

        for(int i=0; i<5; i++){
            exe.execute(print);
        }
        exe.shutdown();

    }
}
