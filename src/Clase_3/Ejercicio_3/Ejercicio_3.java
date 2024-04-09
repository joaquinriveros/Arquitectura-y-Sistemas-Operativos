package Clase_3.Ejercicio_3;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Proceso[] procesos = new Proceso[10];
        for (int i = 0; i < procesos.length; i++) {
            procesos[i] = new Proceso("Hilo " + i, i);
            procesos[i].start();

            try {
                procesos[i].join();
            }catch (Exception e){

            }
        }
        System.out.println(Proceso.contador);
    }
}
