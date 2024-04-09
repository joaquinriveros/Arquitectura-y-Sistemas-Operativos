package Clase_3.Problema_filosofos;

import java.util.concurrent.Semaphore;
import java.util.Random;

class Filosofo extends Thread {
    private int id;
    private Semaphore[] tenedores;
    private Random rand = new Random();

    public Filosofo(int id, Semaphore[] tenedores) {
        this.id = id;
        this.tenedores = tenedores;
    }

    private void comer() throws InterruptedException {
        // Intenta adquirir los tenedores
        tenedores[id].acquire();
        tenedores[(id + 1) % tenedores.length].acquire();

        // Comer
        System.out.println("Filósofo " + id + " comiendo");

        // Simula el tiempo que tarda en comer
        Thread.sleep(rand.nextInt(4000) + 1000);

        // Liberar los tenedores
        tenedores[id].release();
        tenedores[(id + 1) % tenedores.length].release();
    }

    private void pensar() throws InterruptedException {
        // Pensa
        System.out.println("El filósofo " + id + " está pensando");

        // Simula el tiempo que tarda en pensar
        Thread.sleep(rand.nextInt(4000) + 1000);
    }

    @Override
    public void run() {
        try {
            while (true) {
                comer();
                pensar();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

