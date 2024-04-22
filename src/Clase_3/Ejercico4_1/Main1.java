package Clase_3.Ejercico4_1;



public class Main1 {

    public static void main(String[] args) {


   Runtime runtime = Runtime.getRuntime();
   int nNucleos = runtime.availableProcessors();

    Thread [] procesos = new Thread[nNucleos];


        for (int i = 0; i < procesos.length ; i++) {

            Runnable run = new Proceso1(i);
            procesos[i] = new Thread(run);
            procesos[i].start();

        }
        for (int i = 0; i < procesos.length ; i++) {

            try {
                procesos[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        //System.out.println("Contador "+ Proceso.cont);
    }

}
