package java8features;

//    Without use of lambda expressions in multithreding example

/*class MyRunnable implements Runnable{

    //task for child thread
    public void run(){
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("Child Thread");
        }
    }
}

public class LambdaExpressionsInMultiThreading {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread childThread = new Thread(myRunnable);
        childThread.start();

        //task for main thread
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("main thread");
        }
    }
}*/


// With use of lambda in multithreding example
public class LambdaExpressionsInMultiThreading {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 1; i <= 10 ; i++) {
                System.out.println("Child Thread - "+i);
//                System.out.println(Thread.currentThread().getName());// gets thread name
            }
        };
        Thread childThread = new Thread(runnable);
        childThread.start();
        for (int j = 1; j <= 10 ; j++) {
            if(j == 2){
                Thread.sleep(1000);
            }

            System.out.println("Main Thread - "+j);
//            System.out.println(Thread.currentThread().getName()); // gets thread name
        }
    }
}


/*
 *   so the difference with the above example is that we have
 *   more concise code when using lamdba expressions
 *
 *   where in other we have used another class which implements Runnable interface
 *
 */