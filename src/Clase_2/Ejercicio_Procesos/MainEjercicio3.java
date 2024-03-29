package Clase_2.Ejercicio_Procesos;

public class MainEjercicio3 {
    public static void main(String[] args) {
        Proceso[] procesos = new Proceso[10];
        for (int i = 0; i < procesos.length; i++) {
            procesos[i] = new Proceso(i, "Proceso " + i);
            procesos[i].start();
        }
        System.out.println("Procesos ejecutados: " +Proceso.getContador());
    }
}
