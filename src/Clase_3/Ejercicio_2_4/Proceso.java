package Clase_3.Ejercicio_2_4;

import java.util.Random;

public class Proceso extends Thread {

    private static int tam = 8;
    private static int[][] matriz = new int[tam][tam];
    private int ini, fin;

    public Proceso(int ini, int fin) {
        this.ini = ini;
        this.fin = fin;
    }

    public void run() {
        super.run();
        for (int i = ini; i < fin; i++) {
            for (int j = 0; j < matriz[0].length; j++)
                matriz[i][j] *= 10;
        }
    }

    public static void main(String[] args) {

        Runtime runtime =  Runtime.getRuntime();
        int nNucleos = runtime.availableProcessors();
        Random rand = new Random(System.nanoTime());

        double tiempo_inicio , tiempo_final;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++){
                matriz[i][j] = rand.nextInt(10);
            }}

        Thread [] hilos = new Thread[nNucleos];

        int rango = tam/nNucleos; // que pasa

        int start =0;
        int finish = rango;

        for (int i = 0; i < nNucleos; i++) {

            if (i != nNucleos -1){
                hilos[i] = new Proceso(start,finish);
                hilos[i].start();}
            else{
                hilos[i] = new Proceso(start,tam);
                hilos[i].start();}

            start = finish;
            finish += rango;


         /*que pasa cuando la división da decimal?

         solucion
          agregar un if con el siguiente código*/
        }

        for (int i = 0; i < nNucleos; i++) {
            try{
                hilos[i].join();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}