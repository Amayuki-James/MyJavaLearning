package Advanced;

// Threads allows a program to operate more efficiently by doing multiple things at the same time.
// Threads can be used to perform complicated tasks in the background without interrupting the main program.

public class Threads extends Thread {
    // There are 2 ways to create a thread:
    // 1. Extending the Thread class:
    public void customRun() {
        System.out.println("This code is running in a thread.");
    }
    // 2. Implementing the Runnable interface:
//public class Threads implements Runnable {
//    public void run() {
//        System.out.println("This code is running in a thread.");
//    }
//}
    public static void main(String[] args) {
        Threads thread = new Threads();
        thread.start();
        System.out.println("This code is outside of the thread.");
    }    
    public void Run() {
        System.out.println("This code is running in a thread.");
    }
}
