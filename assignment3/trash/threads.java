class Main{
    static int counter = 0;


    //the critical section
    //makes sure that the increment instructions are atomic
    static synchronized void increment1(){
        counter++;
    }


    public static void main(String []args)
        throws InterruptedException{

            Thread t1 = new Thread(() -> {
                for(int i = 0; i < 10000; i++){
                    increment1();
                }
            });

            Thread t2 =  new Thread(() -> {
                for(int j = 0; j < 10000; j++){
                    increment1();
                }
            });

            t1.start();
            t2.start();

            t1.join();
            t2.join();
        
            System.out.println(counter);

            //threads with classes
            Counter counter = new Counter();

            Thread c1 = new Thread(() -> {
                counter.increment();
            });
            Thread c2 = new Thread(() -> {
                counter.increment();
            });
            Thread c3 = new Thread(() -> {
                counter.increment();
            });

            c1.start();
            c2.start();
            c3.start();

            System.out.println(counter.get_count());

    }
}

class Counter{
    public static int count = 0;
    void increment(){
        for(int i = 0; i < 10000; i++){
            count++;
        }
    }
    int get_count(){
        return count;
    }
}