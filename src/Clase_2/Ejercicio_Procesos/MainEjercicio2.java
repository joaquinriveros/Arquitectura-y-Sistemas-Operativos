package Clase_2.Ejercicio_Procesos;

public class MainEjercicio2 {
    public static void main(String[] args) {
        Proceso[] procesos = new Proceso[10];
        for (int i = 0; i < procesos.length; i++) {
            procesos[i] = new Proceso(i, "Proceso " + i);
            procesos[i].start();
            try {
                procesos[i].join();
            } catch (Exception e) {
                System.out.println(e.getCause());
            }
        }
        for (Proceso proceso : procesos) {
            try {
                proceso.join();
            } catch (Exception e) {
                System.out.println("Usted ha ingresado :");
            }
        }
    }
}
