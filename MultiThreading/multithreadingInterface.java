package MultiThreading;

class Hi implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hi");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){};
        }
    }
}
class Hello implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){};
        }
    }
}
class S{
    public static void main(String[] args) throws InterruptedException {
        Hi hi = new Hi(); // we can also use Runnable hi = new Hi();
        Hello hello = new Hello();
        Thread t1 = new Thread(hi);
        Thread t2 = new Thread(hello);
        t1.start();
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){};
        t2.start();
    }
}