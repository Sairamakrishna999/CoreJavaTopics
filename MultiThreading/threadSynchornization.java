package MultiThreading;
// when we are calling 2 threads at a time(thread synchronization) they sometimes gives wrong output because both threads requesting JVM to run them at same time
// So to avoid that we use synchronization 
class threadSynchornization{
    public static int count;
    public synchronized static  void increment(){ // use synchronized word that's it
        count++;
    }
    public static void main(String[] args) throws InterruptedException {
    Thread t1 = new Thread(()->{for(int i=0;i<1000;i++){threadSynchornization.increment();}});
    Thread t2 = new Thread(()->{for(int i=0;i<1000;i++){threadSynchornization.increment();}});
    t1.start();
    t2.start();
    Thread.sleep(10000);
    t1.join();
    t2.join();
    System.out.println(threadSynchornization.count);
    }
}
