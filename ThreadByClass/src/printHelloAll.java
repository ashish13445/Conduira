import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class printHelloAll extends Thread{
    private final String message;
    public printHelloAll(String message){
        this.message = message;
    }
    @Override
    public void run() {
        System.out.println(message);
    }
}
class Main{
    public static void main(String[] args){
        printHelloAll print = new printHelloAll("Hello All");
        ExecutorService exe = Executors.newFixedThreadPool(5);

        for(int i=0; i<5; i++){
            exe.execute(print);
        }
        exe.shutdown();

    }
}
