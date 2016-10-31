package sec14_2;

/**
 * Created by shanghechen on 2016/10/12.
 */
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        // 创建两个线程
        Thread a = new Thread(new MyRunnable("Thread a"));
        Thread b = new Thread(new MyRunnable("Thread b"));
        System.out.println(a.getState());
        System.out.println(b.getState());
        a.start();
        b.start();
        System.out.println(a.getState());
        System.out.println(b.getState());
        a.join();
        b.join();
        System.out.println(a.getState());
        System.out.println(b.getState());
        System.out.println("never arrive.");
    }
}

class MyRunnable implements Runnable {

    private String name;
    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true){

        }
    }
}
