package commonly.asked;

public class EvenOddPrinterThread {

        private static final Object lock = new Object();  // Lock object to synchronize threads
        private static int number = 1;  // Start from 1 and increment for each thread

        // Thread to print even numbers
        static class EvenPrinter extends Thread {
            private int limit;

            public EvenPrinter(int limit) {
                this.limit = limit;
            }

            @Override
            public void run() {
                while (number <= limit) {
                    synchronized (lock) {
                        if (number % 2 == 0) {
                            System.out.println("Even: " + number);
                            number++;
                            lock.notify();  // Notify the other thread (odd printer)
                        } else {
                            try {
                                lock.wait();  // Wait if it's not the turn to print even number
                            } catch (InterruptedException e) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    }
                }
            }
        }

        // Thread to print odd numbers
        static class OddPrinter extends Thread {
            private int limit;

            public OddPrinter(int limit) {
                this.limit = limit;
            }

            @Override
            public void run() {
                while (number <= limit) {
                    synchronized (lock) {
                        if (number % 2 != 0) {
                            System.out.println("Odd: " + number);
                            number++;
                            lock.notify();  // Notify the other thread (even printer)
                        } else {
                            try {
                                lock.wait();  // Wait if it's not the turn to print odd number
                            } catch (InterruptedException e) {
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
            Thread evenThread = new EvenPrinter(limit);
            Thread oddThread = new OddPrinter(limit);

            // Start both threads
            evenThread.start();
            oddThread.start();
        }
    }


