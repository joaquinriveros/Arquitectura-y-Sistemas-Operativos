package Clase_2.Interrupcion_Durante_Sleep;
public class SleepInterrupt implements Runnable {
    public void run() {
        try {
            System.out.println("in run(): me duermo 20 s");
            Thread.sleep(20000);
            System.out.println("in run(): me despierto");
        } catch (InterruptedException e) {
            System.out.println("in run(): interrumpida en sleep");
            return;
        }
        System.out.println("in run(): fin normal");
    }
}