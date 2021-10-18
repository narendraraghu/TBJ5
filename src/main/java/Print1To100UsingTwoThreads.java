public class Print1To100UsingTwoThreads {
    //https://www.geeksforgeeks.org/print-even-and-odd-numbers-in-increasing-order-using-two-threads-in-java/
        int counter = 1;
        static int N;
        public void printOddNumber()
        {
            synchronized (this)
            {
                while (counter < N) {
                    while (counter % 2 == 0) {
                        try {
                            wait();
                        }
                        catch (
                                InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.print(counter + " ");
                    counter++;
                    notify();
                }
            }
        }

        public void printEvenNumber()
        {
            synchronized (this)
            {
                while (counter < N) {
                    while (counter % 2 == 1) {
                        try {
                            wait();
                        }
                        catch (
                                InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.print(counter + " ");
                    counter++;
                    notify();
                }
            }
        }

        // Driver Code
        public static void main(String[] args)
        {
            N = 100;
            Print1To100UsingTwoThreads mt = new Print1To100UsingTwoThreads();
            Thread t1 = new Thread(new Runnable() {
                public void run()
                {
                    mt.printEvenNumber();
                }
            });

            Thread t2 = new Thread(new Runnable() {
                public void run()
                {
                    mt.printOddNumber();
                }
            });

            t1.start();
            t2.start();
        }


}
