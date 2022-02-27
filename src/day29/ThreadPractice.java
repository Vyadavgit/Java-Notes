package day29;

public class ThreadPractice {

    static boolean canLogin = true;
    static int  passwordIncorrectCount = 0;

    public static void main(String[] args) {

        canLogin = false;

        Runnable runnable = new Transaction();

        Runnable runnable1 = () -> {
            System.out.println(Thread.currentThread().getName() + " Thread Started from Lambda");
            try {
                Thread.sleep((int) (5000 * Math.random()));
                canLogin = true;
                System.out.println(Thread.currentThread().getName() + " Thread Completed from Lambda");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable runnable2 = () -> {
            System.out.println(Thread.currentThread().getName() + " Thread Started from Lambda");
            try {
                Thread.sleep((int) (5000 * Math.random()));
                System.out.println(Thread.currentThread().getName() + " Thread Completed from Lambda");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread1 = new Thread(runnable1);
        thread1.setName("thread1");
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
//        thread1.interrupt();


//        thread1.stop();

        Thread thread2 = new Thread(runnable2);
        thread2.setName("thread2");
//        thread2.setDaemon(true);
        thread2.start();
    }
}

// output:
//        thread1 Thread Started from Lambda
//        thread2 Thread Started from Lambda
//        thread1 Thread Completed from Lambda
//        thread2 Thread Completed from Lambda
//
//        Process finished with exit code 0
