package Clase_2.Metodo_Estático_Thread.interrupted;
public class InterruptReset {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println("A: Thread.interrupted()="+Thread.interrupted());
        t.interrupt();
        System.out.println("B: Thread.interrupted()="+Thread.interrupted());
        System.out.println("C: Thread.interrupted()="+Thread.interrupted());
        try{
            Thread.sleep(2000);
            System.out.println("No ha sido interrumpida");
        }catch(InterruptedException e){
            System.out.println("Si ha sido interrumpida");
        }
        System.out.println("D: t.isInterrupted()="+t.isInterrupted());
    }
}