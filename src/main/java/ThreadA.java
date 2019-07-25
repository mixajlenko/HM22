import java.util.Random;

public class ThreadA extends Thread{

    public ThreadA(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
            Random randValue = new Random();
        int min = 1;
        int max = 10;
        int n = randValue.nextInt(max - min) + min;

        while (!Thread.currentThread().isInterrupted()){
            for(int i=0; i<=100; i++){
                Thread.sleep(100);
                System.out.println(n);
            }
        }

        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}
