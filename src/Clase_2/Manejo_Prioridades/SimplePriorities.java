package Clase_2.Manejo_Prioridades;
public class SimplePriorities extends Thread {
    private int countDown = 5;
    private volatile double d = 0; // No optimization

    public SimplePriorities(int priority) {
        setPriority(priority);
        start();
    }

    public String toString() {
        return super.toString() + ": " + countDown;
    }

    public void run() {
        while (true) {
            // An expensive, interruptable operation:
            for (int i = 1; i < 100000; i++)
                d = d + (Math.PI + Math.E) / (double) i;
            System.out.println(this);
            synchronized (this) {
                if (--countDown == 0) return;
            }
        }
    }
}