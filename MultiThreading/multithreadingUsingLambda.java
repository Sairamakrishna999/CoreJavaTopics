package MultiThreading;
class Third{
    public static void main(String[] args) {
        // we can paste the below code directly in the thread
        // Runnable first =()->{
        //         for(int i=0;i<10;i++){
        //             System.out.println("First");
        //             try{
        //                 Thread.sleep(1000);
        //             }
        //             catch(Exception e){};
        //         }
        //     };
        Runnable second = new Runnable(){
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println("Second"+Thread.currentThread().getPriority());
                    try{
                        Thread.sleep(1000);
                    }
                    catch(Exception e){};
                }
            }
        };
        Thread t1 = new Thread(()->{
            for(int i=0;i<10;i++){
                System.out.println("First");
                try{
                    Thread.sleep(1000);
                }
                catch(Exception e){};
            }
        });
        // we can set and get the priority of thread 
        // Max priority is 10 and min priority is 1 and also the Normal priority is 5
        t1.setPriority(10);// t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());
    
        t1.start();
        try{
            Thread.sleep(100);
        }
        catch(Exception e){

        }
        Thread t2= new Thread(second);
        t2.setPriority(10);
        System.out.println(t2.getPriority());
        t2.start();
        // Main method is also a thread so in order to execute your threads first and main thread later you should use join
        // To use join you should throw exception or surround it with try and catch
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // you can check that thread is alive or not using isAlive()
        System.out.println(t2.isAlive());
        System.out.println("sai");
    }
}