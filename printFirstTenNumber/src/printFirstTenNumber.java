import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class printFirstTenNumber implements Runnable{
    @Override
    public void run() {
        for(int i=1; i<11; i++){
           System.out.println(i);
        }
    }
}
class Main{
    public static void main(String[] args){
        printFirstTenNumber print = new printFirstTenNumber();
        ExecutorService exe = Executors.newFixedThreadPool(5);


        exe.execute(print);

        exe.shutdown();

    }
}

