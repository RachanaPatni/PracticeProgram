import jdk.jfr.Threshold;

/*public class Threads extends Thread
{
    //creating a thread
    public static void main(String args[])
    {

           Threads thread=new Threads();
           thread.start();
        System.out.println("my first tread program");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("this  code is running in a thread");
    }
}
*/
// class implements the Runnable interface
/*public class Threads {
    public static void main(String[] args) {
        Thread obj = new Thread();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");
    }

    public void run() {
        System.out.println("This code is running in a thread");
    }
}
*/
/*public class Threads extends Thread
{
    public static int amount=0;

    public static void main(String[]args)
    {
        Threads thread=new Threads();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    @Override
    public void run() {
        super.run();
        amount++;
    }
}
*/
//use isAlive
/*
public class Threads extends Thread
{
    public static int amount=0;
    public static void main(String args[])
    {
        Threads thread=new Threads();
        thread.start();
        //wait for the thread to finish
        while (thread.isAlive())
        {
            System.out.println("Waiting...");
        }
        System.out.println("threads "+amount);
        amount++;
        System.out.println("Threads "+amount);
    }

    @Override
    public void run() {
        super.run();
    }
}
*/
//create multiple user-define threads
/*public class Threads extends Thread
{
    int sum=0;
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            sum+=i;
            System.out.println(sum);
        }
    }
    public static void main(String args[])
    {
        Threads mt1=new Threads();
        mt1.start();
        Threads mt2=new Threads();
        mt2.start();
        Threads mt3=new Threads();
        mt3.start();
    }
}
*/
/*
public class Threads extends Thread
{
    public void run()
    {
        System.out.println("Run");
    }
    public void strat()
    {
        System.out.println("Start");
    }
    public static void main(String args[])
    {
        Threads thread=new Threads();
        thread.start();
        System.out.println("Main");
    }
}
*/
// Thread priority
/*public class Threads extends Thread
{
    public void run()
    {
        System.out.println("running thread name is :"+Thread.currentThread().getName());
        System.out.println("running thread priority is: "+Thread.currentThread().getPriority());
    }
    public static void main(String args[])
    {
        Threads tpr=new Threads();
        Threads tpr1=new Threads();
        tpr.setPriority(Thread.MIN_PRIORITY);
        tpr1.setPriority(Thread.MAX_PRIORITY);
        tpr.start();
        tpr1.start();
    }
}
*/
public  class Threads implements Runnable
{
    double num;
    @Override
    public void run() {
       for(int i=0;i<1000;i++)
       {
           num=Math.random();
           try{
               Thread.sleep(1000);
           }
           catch (InterruptedException ie)
           {
           }
       }
    }
    public class DeaomaoThread
    {
        public static void main(String[] args)
        {
            Threads td=new Threads();
            Thread t=new Thread(td);
            td.setDaemon(true);
            td.start();
            for(int i=1;i<=5;i++){
                System.out.println("Main Threadvalue:" +td.num);
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException ie)
                {

                }
            }
        }
    }

    private void start() {
    }

    private void setDaemon(boolean b) {
    }

}




