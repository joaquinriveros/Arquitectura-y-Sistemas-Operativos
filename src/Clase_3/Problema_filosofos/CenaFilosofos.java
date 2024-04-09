package Clase_3.Problema_filosofos;

import java.util.concurrent.Semaphore;

public class CenaFilosofos {
    public static void main(String[] args) {
        // Número de filósofos
        int numFilosofos = 5;

        // Arreglo de semáforos para representar los tenedores
        Semaphore[] tenedores = new Semaphore[numFilosofos];
        for (int i = 0; i < numFilosofos; i++) {
            tenedores[i] = new Semaphore(1);
        }

        // Crear e iniciar a los filósofos
        Filosofo[] filosofos = new Filosofo[numFilosofos];
        for (int i = 0; i < numFilosofos; i++) {
            filosofos[i] = new Filosofo(i, tenedores);
            filosofos[i].start();
        }
    }
}