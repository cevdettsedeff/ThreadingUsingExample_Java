public class KronometreThread implements Runnable {

    private Thread thread;
    private String threadName;

    public KronometreThread(String threadName){
        this.threadName=threadName;
        System.out.println("Thread is creating: "+ threadName);
    }

    @Override
    public void run() {
        System.out.println("Starting: "+threadName);

        for(int i=1; i<=10;i++)
        {
            System.out.println(threadName + " : " +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error : "+ threadName);
            }

        }

        System.out.println("Thread is over: " + threadName);
    }

    public void start(){
        System.out.println("Thread is creating:");
        if(thread==null){
            thread = new Thread(this,threadName);
            thread.start();
        }
    }
}
