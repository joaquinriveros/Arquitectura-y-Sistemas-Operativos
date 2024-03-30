package Clase_2.Ejemplo_Metodo_Current_Thread;

public class Recurso {
    static synchronized void uso() {
        Thread t = Thread.currentThread();
        System.out.println("Soy " + t.getName());
    }
}
