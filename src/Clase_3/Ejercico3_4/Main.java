package Clase_3.Ejercico3_4;


public class Main {

    public static void main(String[] args) {


   int numHilos = 11;

    Thread [] hilos = new Thread[numHilos];


        for (int i = 0; i < hilos.length ; i++) {

            Runnable run = null;

            if (i != 0){
                run = new Proceso(true);
            }
            else {
                run = new Proceso(false);
            }

            hilos[i] = new Thread(run);
            hilos[i].start();

        }
        for (int i = 0; i < hilos.length ; i++) {

            try {
                hilos[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        System.out.println("Soy el hilo ");
    }

}
