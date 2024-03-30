package Clase_2.Ejemplo_Interrupt_Interrupted;
public class MiThread extends Thread{
    public void run(){
        while (!Thread.interrupted()) {
            System.out.println("Ejecuto");
        }
        System.out.println("Termino");
    }
}