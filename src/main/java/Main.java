public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Thread is started.");

        MyThread myThread1 = new MyThread("LuckyThread");
        ThreadA secondThread = new ThreadA("B");

        myThread1.start();
        myThread1.join(12 * 100);
        Thread.sleep(12 * 1000);

        secondThread.start();
        Thread.sleep(5 * 1000);
        secondThread.interrupt();

        System.out.println("Thread is finished");
    }
}
