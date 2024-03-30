package Clase_2.Método_Is_Interrupted;
public class InterruptCheck {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("A:t.isInterrupted()=" + t.isInterrupted());
        t.interrupt();
        System.out.println("B:t.isInterrupted()=" + t.isInterrupted());
        System.out.println("C:t.isInterrupted()=" + t.isInterrupted());
        try {
            Thread.sleep(2000);
            System.out.println("No ha sido interrumpida");
        } catch (InterruptedException e) {
            System.out.println("Si ha sido interrumpida");
        }
        System.out.println("D:t.isInterrupted()=" + t.isInterrupted());
    }
}