// We can do multithreading in 2 days
// 1st way is by extending the thread class
// 2nd way is by implementing runnable interface
/*class Main extends Thread{
    public  void run(){
        System.out.println("I am inside run");
    }
}
class multithreadingSample{
    public static void main(String[] args) throws InterruptedException {
        Main m = new Main();
        Main m1 = new Main();
        m.start(); // if we write normal run(), then it is not thread it is just normal method
        Thread.sleep(10000);// waiting for 10 seconds
        m1.start();
    }
} */

// 2nd way by implementing Runnable
package MultiThreading;
class Main implements Runnable{
    public void run(){
        System.out.println("I am inside run through Runnable");
    }
}
class multithreadingSample{
    public static void main(String args[]){
        Main m = new Main();
        Thread thread = new Thread(m); // This extra line is needed if you are dealing with Runnable interface
        thread.start();
    }
}