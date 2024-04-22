package Clase_3.Ejercicio_Sincronización_Complementario;

public class Impresora {
    //Metodos
    public synchronized void imprimir(int numero){
        System.out.println(Thread.currentThread().getName() + ": " + numero);
        notify(); // Notificar al otro hilo que puede imprimir
        try {
            wait(); // Esperar a que el otro hilo imprima
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();// Se interrumpe el Hilo
        }
    }
}
