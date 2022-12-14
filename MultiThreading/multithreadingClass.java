package MultiThreading;

class Q extends Thread{
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
class R extends Thread{
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
        Q q = new Q();
        R r = new R();
        q.start();
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){};
        r.start();
    }
}