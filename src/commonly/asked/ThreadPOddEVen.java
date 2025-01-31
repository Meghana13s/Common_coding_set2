package commonly.asked;

public class ThreadPOddEVen {
    private static int number = 1;
    private static final Object lock = new Object();

    static class Even extends Thread{

        private int limit;

        @Override
        public void run() {
            while (number <= limit) {
                synchronized (lock) {
                    if(number%2 ==0) {
                        System.out.println("Even:"+number);
                        number++;
                        lock.notify();
                    } else {
                        try{
                            lock.wait();
                        }catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }

                    }
                }
            }
        }

    }

    static class Odd extends Thread{

        private int limit;

        @Override
        public void run() {
            while (number <= limit) {
                synchronized (lock) {
                    if(number%2 != 0) {
                        System.out.println("odd:"+number);
                        number++;
                        lock.notify();
                    } else {
                        try{
                            lock.wait();
                        }catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }

                    }
                }
            }
        }


    }

    public static void main(String[] args) {

        int limit = 50;  // Set the limit for the numbers to print

        // Create two threads: one for even numbers and one for odd numbers
        Thread evenThread = new EvenOddPrinterThread.EvenPrinter(limit);
        Thread oddThread = new EvenOddPrinterThread.OddPrinter(limit);

        // Start both threads
        evenThread.start();
        oddThread.start();

    }
}
