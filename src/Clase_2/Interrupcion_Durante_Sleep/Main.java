package Clase_2.Interrupcion_Durante_Sleep;
public class Main {
    public static void main(String[] args) {
        SleepInterrupt si=new SleepInterrupt();
        Thread t=new Thread(si);
        t.start();
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){};
        System.out.println("in main(): Intterupo a t");
        t.interrupt();
        System.out.println("in main(): termina");
    }
}

